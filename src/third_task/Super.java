package third_task;


public class Super {

    public static void main(String[] args) {

        checkSwich(1);

    }

    private static void checkSwich(int test) {

        switch (test) {
            case 1:
                System.out.println(superFormula(12,17,23));
                checkSuperFormula();
                System.out.println(checkWithTernary());
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

    public static int  superFormula(int first, int second, int third ){
        int result = first * second + third / first + second * third;
        return result;
    }

    public static void checkSuperFormula(){
        if (superFormula(12, 17, 23) == 5) {
            System.out.println("superFormula equal to five, said if. ok");
        } else {
            System.out.println("superFormula biggest than five, said else. ok");
        }
    }

    public static String  checkWithTernary() {
       String str = superFormula(12,17,23) == 5 ? "superFormula equal to five, said ternary" :
               "superFormula biggest than five, said ternary";
        return str;
    }

    public static void first(String str) {

        int persent = 100;
        double happiness = 0.99;
        boolean say = true;

        for (int i = 0; i < 5; i++) {
            System.out.println(str);
            System.out.println("There is" + say + ", that there are" + persent + " percent success with"
                    + happiness + "happiness.");
        }

    }

    public static void   while_go(int count) {
        while (count <= 10) {
            System.out.println(count);
            count++;

        }

    }

}
