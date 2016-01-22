package third_task;


public class Shall {

    public static void main(String[] args) {

        withoutFib();
    }

    private static void withoutFib() {
        int first[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int last[] = new int[first.length];

        System.arraycopy(first, 0, last, 0, last.length);

        int second[] = new int[first.length];

        for (int i = 2; i < first.length - 3; i++) {
            int s = first[i] = first[i - 2] + first[i - 1];
            second[i - 1] = s;
        }

        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < last.length; j++) {
                if (second[i] == last[j]) {
                    last[j] = 0;
                }
            }
        }

        System.out.print("Number without fib:");

        for (int i = 0; i < last.length; i++) {
            if (last[i] != 0) {
                System.out.print(" ");
                System.out.print(last[i]);
            }
        }
    }
}
