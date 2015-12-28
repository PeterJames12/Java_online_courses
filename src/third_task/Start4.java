package third_task;


public class Start4 {

    public static void main(String[] args) {

        int mas[] = {2, 5, 4, 9, 4, 6};

        System.out.println(sumMas(mas));
    }

    private static int sumMas(int mas[]) {

        int result = 0;

        for (int i = 0; i < mas.length; i++) {
             result += mas[i];
        }
        return result;
    }

}
