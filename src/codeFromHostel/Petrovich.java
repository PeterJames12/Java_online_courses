package codeFromHostel;

import java.util.Random;


public class Petrovich {

    public static void main(String[] args) {

        test31Petrovich();
        test32Massiv();
        test35CopyMass();
        test36GeneralDiagonal();
        random();
    }

    private static void test36GeneralDiagonal() {

        int mas[][] = {{1, 2, 3}, {3, 2, 1}, {6, 5, 4}};

    }

    private static void test35CopyMass() {

        int mas[][] = {{1, 2, 3}, {3, 2, 1}, {6, 5, 4}};
        int arrg[][] = new int[3][3];

        System.arraycopy(mas, 0, arrg, 0, 3);
        test33goToConsoleMas(arrg);
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
        test33goToConsoleMas(mas);
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
        for (int i = 0; i < 1000; i++) {
            int rand = new Random().nextInt(4);
            if (rand == 0) {
                go += 1;
            }
        }
        System.out.println("% = " + (go * 100) / 1000);
    }

}
