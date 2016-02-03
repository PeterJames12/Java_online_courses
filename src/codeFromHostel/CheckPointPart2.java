package codeFromHostel;


import java.util.Random;

public class CheckPointPart2 {

    static private int resultMax = 0;

    static private int howManyMatrix = 1 + new Random().nextInt(23);//Загадкове число 23,
    // справа в тому що 23-го числа народилась моя племінниця)))

    public static void main(String[] args) {

        finishCheckPoint();
        System.out.println("Дякую школі U-Rise за досвід та практику, Макс ти хороший викладач!!!");
    }

    public static void finishCheckPoint() {

        int line = 3;
        int coloumn = 3;

        int result[][] = new int[line][coloumn];

        chtopMatrix(line, coloumn, result, howManyMatrix);

        finalMethotd(resultMax);
    }

    private static void chtopMatrix(int line, int coloumn, int result[][], int howManyMatrixYouWant) {

        int mas[][] = new int[line][coloumn];
        int arg[][] = new int[line][coloumn];

        int start = 0;

        if (howManyMatrixYouWant > start) {

            Random random = new Random();

            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    int goMas = 1 + random.nextInt(4);
                    mas[j][i] = goMas;
                }
            }
            for (int i = 0; i < arg.length; i++) {
                for (int j = 0; j < arg[i].length; j++) {
                    int goMas = 1 + random.nextInt(4);
                    arg[j][i] = goMas;
                }
            }
            chtopMatrix(line, coloumn, result, howManyMatrixYouWant - 1);
            MatrixXXX(result, mas, arg);
        }
    }

    private static void MatrixXXX(int[][] result, int[][] mas, int[][] arg) {

        for (int line = 0; line < mas.length; line++) {
            for (int coloumn = 0; coloumn < arg[line].length; coloumn++) {
                for (int resMatrix = 0; resMatrix < arg.length; resMatrix++) {
                    result[line][coloumn] += mas[line][resMatrix] * arg[resMatrix][coloumn];
                }
            }
        }
        goToConsole(result);
    }

    private static void goToConsole(int[][] result) {

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        findmaxElement(result);
    }

    public static void findmaxElement(int[][] result) {

        int maxElement = 0;

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (result[i][j] > maxElement) {
                    maxElement = result[i][j];
                }
            }
        }
        resultMax += maxElement;

        System.out.println("Максимальний елемент = " + maxElement);
        System.out.println();
    }

    private static void finalMethotd(int resultMax) {

        int finished = resultMax / howManyMatrix;
        System.out.println("Середнє арифметичне всіх максимальних чисел = " + finished);

        String str = Integer.toString(finished);

        int sum = 0;

        int mas[] = new int[str.length()];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = finished % 10;
            finished /= 10;
        }
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        System.out.println("Сума цифр середнього арифметичного = " + sum);
    }
}