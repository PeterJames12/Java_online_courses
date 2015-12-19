package third_task;


public class Test5 {

    public static void main(String[] args) {

        int count = 1;

        while_go(count);

    }

    private static void while_go(int count) {
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
    }

}
