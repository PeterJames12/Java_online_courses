package codeFromHostel;

import java.util.Random;


public class Petrovich {

    public static void main(String[] args) {
    
        test31Petrovich();
        test32Massiv();
        test35CopyMass();
        test36GeneralDiagonal();
        test37OtherDiagonal();
        test38Otriangle();
        random();
        test39Schochukc();
        test40Matrix();
        test41chtopMatrix(3, 3, 23);
    }

    private static void test38Otriangle() {

        int mas[][] = {{32, 42, 45, 91, 41, 39, 100},
                {33, 39, 31, 10, 11, 83, 100},
                {32, 10, 12, 23, 15, 17, 100},
                {32, 22, 25, 92, 26, 27, 100},
                {73, 79, 31, 10, 11, 78, 100},
                {32, 10, 12, 23, 15, 17, 100},
                {63, 69, 61, 10, 11, 68, 100}};

        int result = 0;

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < mas[i].length - 1; j++) {
                result += mas[i][j];
            }
        }

        for (int i = 1; i < 2; i++) {
            for (int j = 2; j < mas[i].length - 2; j++) {
                result += mas[i][j];
            }
        }

        for (int i = 2; i < 3; i++) {
            for (int j = 3; j < mas[i].length - 3; j++) {
                result += mas[i][j];
            }
        }
        System.out.println("Тут трохи багато форів, " +
                "але в завданні сказано порахувати суму трикутника заданого масиву," +
                " а не універсального, і його сума = " + result);
        // test33goToConsoleMas(mas);
    }

    private static void test37OtherDiagonal() {

        int mas[][] = {{12, 2, 5}, {3, 5, 1}, {5, 10, 12}};

        int fitst = mas[0][mas.length - 1];
        int second = mas[mas.length / 2][mas.length / 2];
        int third = mas[0][mas.length - 1];
        int halh = mas.length;

        int result = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == fitst | mas[i][j] == second | mas[i][j] == third) {
                    result += mas[i][j];
                }
            }
        }
        System.out.println("Середнє арефметичне побічної діагоналі = " + result / halh);
        // test33goToConsoleMas(mas);
    }

    private static void test36GeneralDiagonal() {

        int mas[][] = {{12, 2, 3}, {3, 12, 1}, {6, 5, 12}};

        int first = mas[0][0];
        int second = mas[mas.length / 2][mas.length / 2];
        int third = mas[mas.length - 1][mas.length - 1];

        int result = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == first | mas[i][j] == second | mas[i][j] == third) {
                    result += mas[i][j];
                }
            }
        }
        System.out.println("Сума головної діагоналі = " + result);

        //test33goToConsoleMas(mas);

    }

    private static void test35CopyMass() {

        int mas[][] = {{1, 2, 3}, {3, 2, 1}, {6, 5, 4}};
        int arg[][] = new int[3][3];

        System.arraycopy(mas, 0, arg, 0, 3);
        // test33goToConsoleMas(arg);
    }

    private static void test31Petrovich() {

        int mas[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int rand = new Random().nextInt(mas.length);

        System.out.println(goSearshMas(mas, rand));
    }

    private static boolean goSearshMas(int[] mas, int rand) {

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == rand) {
                return true;
            }
        }
        return false;
    }

    private static void test32Massiv() {

        Random random = new Random();

        int mas[][] = new int[3][3];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                int goMas = random.nextInt(12);
                mas[j][i] = goMas;
            }
        }
        // test33goToConsoleMas(mas);
        System.out.println(test34goSearshMas(mas, 8));
    }

    private static void test33goToConsoleMas(int[][] mas) {

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static boolean test34goSearshMas(int[][] mas, int find) {

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == find) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void random() {

        int go = 0;
        int rand = 0;
        for (int i = 0; i < 1000; i++) {
            rand = new Random().nextInt(4);
            if (rand == 0) {
                go += 1;
            }
        }
        System.out.println("Частота зустрічи " + rand + " = " + (go * 100) / 1000 + " %");
    }

    private static void test39Schochukc() {
        int mas[][] = {{23, 23, 23}, {23, 23, 23}, {23, 23, 23}};

        int gsmart = 23;
        int go = 0;
        int tmp = mas.length * mas[0].length;
        System.out.println("tmp = " + tmp);

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == gsmart) {
                    go += 1;
                }
            }
        }
        System.out.println("Частота зустрічи " + " = " + (go * 100) / tmp + " %");
    }

    private static void test40Matrix() {

        //27x27)

        int mas[][] = {{23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23},
                {23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,23, 23, 23,}};

        int arg[][] = {{12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12},
                {12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12,12, 12, 12}};

        int result[][] = new int[mas.length][arg.length];

        for (int line = 0; line < mas.length; line++) {
            for (int coloumn = 0; coloumn < arg[line].length; coloumn++) {
                for (int resMatrix = 0; resMatrix < arg.length; resMatrix++) {
                    result[line][coloumn] += mas[line][resMatrix] * arg[resMatrix][coloumn];
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void test41SuperMatrix(int [][] mas) {

        for (int k = 0; k < mas.length; k++) {
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length - 1; j++) {
                    if (mas[i][j] > mas[i][j + 1]) {
                        int tmp = mas[i][j];
                        mas[i][j] = mas[i][j + 1];
                        mas[i][j + 1] = tmp;
                    }
                }
            }
        }
        test33goToConsoleMas(mas);
        System.out.println();
    }

    private static void test41chtopMatrix(int line, int coloumn, int howManyMatrixYouWant) {

        int start = 0;

        if (howManyMatrixYouWant > start) {

            Random random = new Random();

            int mas[][] = new int[line][coloumn];

            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    int goMas = random.nextInt(23);
                    mas[j][i] = goMas;
                }
            }
            test41chtopMatrix(line, coloumn, howManyMatrixYouWant - 1);
            test41SuperMatrix(mas);
        }
    }
}
