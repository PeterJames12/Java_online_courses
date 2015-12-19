package third_task;


public class Super {

    public static void main(String[] args) {
        //test2
        int speed = 60;
        int maxSpeed = 110;
        boolean YouHavePrava = true;
        superSpeed(speed, maxSpeed,YouHavePrava);
        //test1
        int first = 33;
        int second = 32;
        count(first, second);
        System.out.println(ternaryCount(first, second));
        //test3
        int ageGirl = 20;
        Years(ageGirl);
        //test4
        first("Hello, U-Rise!");
        //test5
        int count = 1;
        while_go(count);
    }

    private static void superSpeed(int speed, int maxSpeed, boolean YouHavePrava) {
        if (speed > maxSpeed || !YouHavePrava) {
            System.out.println("Астанавітесь!!!");
        } else {
            System.out.println("Гарної дороги");
        }
    }

    private static String ternaryCount(int first, int second) {
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

    private static void Years(int ageGirl) {

        switch (ageGirl) {

            case 18:
                System.out.println("I think you yet a little girl"); //Sorry for my english)
                break;
            case 19:
                System.out.println("I think you pretty girl");
                break;
            case 20:
                System.out.println("I think you good-looking");
                break;
        }


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

    private static void while_go(int count) {
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

    }

}
