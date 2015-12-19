package third_task;


public class Test1 {
    public static void main(String[] args) {

        int first = 33;
        int second = 32;

        count(first,second);
        System.out.println(ternarCount(first,second));

    }

    private static String  ternarCount(int first, int second) {
        int result = first / second;
        return result == 5 ? "Ok" : "Learn";

    }

    private static void count(int first, int second) {

        int result = first * second;

        if (result == 5) {
            System.out.println("All right");
        } else {
            System.out.println("Try again");
        }


    }

}
