package third_task;


public class Super {

    public static void main(String[] args) {

        checkSwich(6);

    }

    private static void checkSwich(int test) {

        switch (test) {
            case 1:
                count(32,33);
                System.out.println(ternaryCount(32, 33));
                break;
            case 2:
                superSpeed();
                break;
            case 3:
                System.out.println("Я і є test3");
                break;
            case 4:
                first("Hello, U-Rise!");
                break;
            case 5:
                while_go(1);
                break;
            default:
                System.out.println("Астанавитесь");
        }

    }

    public static void superSpeed() {

        int speed = 60;
        int maxSpeed = 110;
        int countPeople = 400;
        int countFriend = 12;
        int countVolunteer = 200;
        String where = "Контрактова площа";
        String when = "26.04.2015";
        boolean YouHavePrava = true;

        //Простиня правда така
        //Кров з глаз

        if (speed > maxSpeed || !YouHavePrava) {
            System.out.println("Астанавітесь!!!");
        } else {
            System.out.println("Гарної дороги");
        }

        if (countPeople >= 333) {
            System.out.println("Я бігтиму півмарафон");
        } else {
            System.out.println("Та ладно...всеодно побіжу");
        }

        if (countFriend !=0) {
            System.out.println("Я бігтиму півмарафон з друзями, їх буде " + countFriend);
        } else {
            System.out.println("Доведеться бігти без друзів");
        }

        if (countVolunteer <=200) {
            System.out.println("Організація півмарафону чудова ");
        } else {
            System.out.println("Потрібно більше волонтерів");
        }

        if (where == "Контрактова площа" && when == "26.04.2015") {
            System.out.println("Я бігтиму по знайомому маршруту");
        } else {
            System.out.println("Я бігтиму по новому маршруту");
        }


    }

    public static String   ternaryCount(int first, int second) {
        int result = first * second * 12;
        String str = result == 5 ? "result = 5" : "result != 5";
        return str;

        }

    public static int count(int first, int second) {

        int result = first * second * 12;

        if (result == 5) {
            System.out.println("result = 5");
        } else {
            System.out.println("result != 5");
        }
        return result;

    }

    public static void first(String str) {

        int persent = 100;
        double happiness = 0.99;
        boolean say = true;

        for (int i = 0; i < 5; i++) {
            System.out.println(str);
            System.out.println("There is" + say + ", that there are" + persent + " percent sucess with"
                    + happiness + "happiness.");
        }

    }

    public static void while_go(int count) {
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

    }

}
