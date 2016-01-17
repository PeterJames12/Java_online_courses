package third_task;


public class Garret {

    public static void main(String[] args) {

        System.out.println(fib(10));
        System.out.println(fibRec(12));

        System.out.println(fec(5));
        System.out.println(fecNearly(6));
        zeroOne(255);

    }

    private static void withDouble(double router) {
        double db = 0.625;
        double result;
        result = db * 2;
        double finish;
        finish = result % 2;
    }

    private static void zeroOne(int cisco) {
        //System.out.println(Integer.toBinaryString(cisco));
        int res;

        while (cisco != 0) {
            res = cisco % 2;
            System.out.print(res);
            cisco = cisco / 2;
        }
    }

    private static int fib(int arr) {

        int mas[] = new int[arr + 1];
        mas[0] = 0;
        mas[1] = 1;

        for (int i = 2; i < mas.length; i++) {
            mas[i] = mas[i - 2] + mas[i - 1];
        }
        return mas[arr];
    }

    private static int fibRec(int arr) {

        return (arr < 2) ? arr : fibRec(arr - 2) + fibRec(arr - 1);
    }

    private static long fecNearly(int cisco) {

        int res = 1;

        if (cisco <= 0) {
            return -1;
        }
        if (cisco == 1) {
            return cisco;
        }

        for (int i = 1; i < cisco; i++) {
            res *= i;
        }
        return res;
    }

    private static long fec(int cisco) {

        int res = 1;

        if (cisco <= 0) {
            return -1;
        }
        if (cisco == 1) {
            return cisco;
        }
        while (cisco > 0) {
            res *= cisco--;
        }
        return res;
    }
}
