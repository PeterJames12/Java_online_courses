package third_task;


import java.util.Arrays;
import java.util.Random;

public class Garret {

    public static void main(String[] args) {
        System.out.println(fib(10));//15
        System.out.println(fibRec(12));//16

        System.out.println(fec(5));//18
        System.out.println(fecNearly(6));//17
        zeroOne(255);//19

        freeCount(12);
        copyMac();
        secondCount(5,12);
    }

    private static void secondCount(int first, int second) {

        int mac[] = new int[second - first - 1];

        int res;

        for (int i = 0; i < mac.length; i++) {
            mac[i] = ++first;
            res = mac[i] % 2;
            if (res == 0) {
                System.out.print(" " + mac[i]);
            }
        }
    }

    private static void freeCount(int number) {

        int mas[] = new int[number];

        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            int goMas = random.nextInt(23);
            mas[i] = goMas;
        }
        goConsoleMas(mas);

        goSearshMas(mas);
    }

    private static void copyMac() {

        int mas[] = {1, 2, 5, 4, 6, 7, 8, 5, 8, 2, 5};

        int arr[] = new int[5];

        System.arraycopy(mas, 0, arr, 0, arr.length);

        System.out.println(Arrays.toString(mas));
        System.out.println(Arrays.toString(arr));
    }

    private static void goSearshMas(int[] mas) {

        int find = 12;
        int result = 0;

        for (int i = 0; i < mas.length; i++) {
            int elem = mas[i];
            if (elem == find) {
                result = i;
                break;
            } else {
                result = -1;
            }
        }
        System.out.println("Index " + result);
    }

    private static void goConsoleMas(int mas []) {

        System.out.println(Arrays.toString(mas));

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

    private static long fibRec(int arr) {

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
            res = res * cisco;
            cisco--;
        }
        return res;
    }
}
