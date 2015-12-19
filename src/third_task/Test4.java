package third_task;


public class Test4 {

    public static void main(String[] args) {

        first("Hello, U-Rise!");

    }

    private static void first(String str) {

        int persent = 100;
        double happiness = 0.99;
        boolean say = true;

        for (int i = 0; i < 5; i++) {
            System.out.println(str);
            System.out.println("There is" + say + ", that there are" + persent + " percent sucess with"
                    + happiness + "happiness.");
        }

    }

}
