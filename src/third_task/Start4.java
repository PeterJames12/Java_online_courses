package third_task;


public class Start4 {

    public static void main(String[] args) {

        int first = 5;
        int second = 4;
        final int sex = first;
        test(first, second, sex);

        int mas[] = {2, 5, 4, 9, 4, 8};

        System.out.println(sumMas(mas));

        System.out.println(fib(10));

        System.out.println(fibRec(12));

    }

    private static void test(int ars, int wer,int result) {

        if (wer > 1) {
            ars *= result;
            test(ars, wer - 1,result);
        } else {
            System.out.println(ars);
        }
    }

    private static int sumMas(int mas[]) {

        int result = 0;

        for (int i = 0; i < mas.length; i++) {
            result += mas[i];
        }
        return result;
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
}



