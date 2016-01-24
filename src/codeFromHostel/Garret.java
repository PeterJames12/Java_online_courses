package codeFromHostel;


import java.util.Arrays;
import java.util.Random;

public class Garret {

    public static void main(String[] args) {
        test28freeCount(12);

        System.out.println(test18fecNearly(12));

        System.out.println(test17fec(9));
        System.out.println(test15fib(10));
        System.out.println(test16fibRec(12));

        test22secondCount(5, 12);
        test21copyMac();
        System.out.println(test19RellyInt("12"));
        System.out.println(test20GoToOneNumber("Now 2016 year"));

        test26zeroOne(255);

        System.out.println(test24TwoCount(1532));

        test25DelPall(6996);

        test22secondCount(5,17);
        test23ArProg(5, 17);
    }

    private static void test23ArProg(int life, int lifecell) {

        if (life == lifecell) {
            System.out.println(-1);
        }

        int mac[] = new int[lifecell - life];
        int progress = 2;

        for (int i = 0; i < mac.length; i++) {
            life += progress;
            if (life < lifecell) {
                System.out.println(life);
            }
        }
    }

    private static void test25DelPall(int lifecell) {

        String str = Integer.toString(lifecell);

        boolean check = true;

        int arr[] = new int[str.length()];
        goToMassiv(arr, lifecell);
        Arrays.sort(arr);

        int last = arr[arr.length-1];

        int countMass = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != last) {
                countMass += 1;
            }
            if (arr[i] == last) {
                arr[i] = 0;
            }
        }

        int mas[] = new int[countMass];

        System.arraycopy(arr, 0, mas, 0, mas.length);

        for (int i = 0; i < mas.length; i++) {
            if (arr[i] == arr[mas.length - i - 1]) {
                check = true;
            } else {
                check = false;
            }
        }
        System.out.println(check);
    }

    private static boolean test24TwoCount(int lifecell) {

        String str = Integer.toString(lifecell);

        int arr[] = new int[str.length()];

        goToMassiv(arr, lifecell);

        Arrays.sort(arr);

        int first = arr[0];
        int last = arr[arr.length - 1];

        if ((first + last) % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void goToMassiv(int[] arr, int lifecell) {

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = lifecell % 10;
            lifecell /= 10;
        }
    }

    public static boolean test19CheckInt(char ch) {

        return Character.isDigit(ch);
    }

    public static boolean test19RellyInt(String number) {

        for (int i = 0; i < number.toCharArray().length; i++) {
            if (!test19CheckInt(number.toCharArray()[i])) {
                return false;
            }
        }
        return true;
    }

    public static int test19GoToConsole(String number) {

        if (!test19RellyInt(number)) {
            return -1;
        }
        return Integer.parseInt(number);
    }

    public static int test20GoToOneNumber(String number) {
        String result = "";
        for (int i = 0; i < number.toCharArray().length; i++) {
            if (test19CheckInt(number.toCharArray()[i])) {
                result += number.toCharArray()[i];
            }
        }
        return test19GoToConsole(result);
    }

    private static void test22secondCount(int first, int second) {

        int mac[] = new int[second - first - 1];

        int res;

        for (int i = 0; i < mac.length; i++) {
            mac[i] = ++first;
            res = mac[i] % 2;
            if (res == 0) {
                System.out.print(" " + mac[i]);
            }
        }
        System.out.println();// Це щоб результат наступного методу
        // не був в одному рядку в консолі з даним методом
    }

    private static void test28freeCount(int number) {

        int mas[] = new int[number];

        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            int goMas = random.nextInt(23);
            mas[i] = goMas;
        }
        test29goConsoleMas(mas);

        test30goSearshMas(mas, 8);
    }

    private static void test21copyMac() {

        int mas[] = {1, 2, 5, 4, 6, 7, 8, 5, 8, 2, 5};

        int arr[] = new int[5];

        System.arraycopy(mas, 0, arr, 0, arr.length);

        System.out.println(Arrays.toString(mas));
        System.out.println(Arrays.toString(arr));
    }

    private static boolean test30goSearshMas(int[] mas, int find) {

        for (int i = 0; i < mas.length; i++) {
                if (mas[i] == find) {
                    return true;
                }
            }
        return false;
    }

    private static void test29goConsoleMas(int mas[]) {

        System.out.println(Arrays.toString(mas));

    }

    private static void ZeroOnewWintDouble(double router) {

        double db = 0.625;
        double result;
        result = db * 2;
        double finish;
        finish = result % 2;
    }

    private static void test26zeroOne(int cisco) {

        //System.out.println(Integer.toBinaryString(cisco));
        int res;

        while (cisco != 0) {
            res = cisco % 2;
            System.out.print(res);
            cisco = cisco / 2;
        }
    }

    private static int test15fib(int arr) {

        int mas[] = new int[arr + 1];
        mas[0] = 0;
        mas[1] = 1;

        for (int i = 2; i < mas.length; i++) {
            mas[i] = mas[i - 2] + mas[i - 1];
        }
        return mas[arr];
    }

    private static long test16fibRec(int arr) {

        return (arr < 2) ? arr : test16fibRec(arr - 2) + test16fibRec(arr - 1);
    }

    private static long test18fecNearly(int cisco) {

        if (cisco <= 0) {
            return -1;
        }
        if (cisco == 1) {
            return cisco;
        }
        if (cisco <= 4) return 2;
        if (cisco > 4 && cisco <= 15) return 3;
        if (cisco > 15 && cisco <= 72) return 4;
        if (cisco > 72 && cisco <= 420) return 5;
        if (cisco > 420 && cisco <= 2160) return 6;
        if (cisco > 2160 && cisco <= 22680) return 7;
        if (cisco > 22680 && cisco <= 204120) return 8;
        System.out.println("Навіщо таке велике число??? ");
        return cisco;
    }

    private static long test17fec(int cisco) {

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
