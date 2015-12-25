package third_task;


public class PeterJames {

    public static void main(String[] args) {

        hello("Say Hello right now:");//1
        System.out.println(checkInt("1"));//2
        tryGipotenysa();//3
        checkRivnobedreny();//4
        checkTwoRivnostoronuh();//5
        twoCount(12,23);//6
        evenNumber(17,23);//7
        fooCount();//8
        comeBack();//9
        fooCountPartTwo();//10
        whyBig();//11
        quadraticEquation();//12 and 13
        System.out.println(checkString("We love Ukraine"));//14
    }

    private static void hello(String hello) {

        String say = " Hello";
        System.out.println(hello + say);

    }

    private static boolean checkInt(String string) {

        if (string == null) return false;
        return string.matches("^-?\\d+$");
    }

    private static void tryGipotenysa() {

        int first = 3;
        int second = 4;
        int third = 5;

        int katet1 = (int) Math.pow(first, 2);
        int katet2 = (int) Math.pow(second, 2);
        int result = (int) Math.pow(third, 2);

        if (katet1 + katet2 == result) {
            System.out.println("Трикутник прямокутний");
        } else {
            System.out.println("Трикутник якійсь інший");
        }

    }

    private static void checkRivnobedreny() {

        int storona1 = 10;
        int storona2 = 10;
        int storona3 = 8;

        if (storona1 == storona2 && storona3 < storona1 || storona3 < storona2 && storona3 >0) {
            System.out.println("Трикутник рівнобедрений");
        } else {
            System.out.println("Трикутник не рівнобедрений");
        }

    }

    private static void checkTwoRivnostoronuh() {

        int one = 12;
        int two = 12;
        int thee = 12;
        String  result = null;

        int  foo = 23;
        int five = 23;
        int six = 23;
        String result2 = null;

        if (one == two && thee == (two + one + thee) / 3) {
            result = "We love Ukraine";
        } else {
            result = "Океан Ельзи";
        }

        if (foo == five && six == (five + foo + six) / 3) {
            result2 = "We love Ukraine";
        } else {
            result2 = "Hello";
        }

        if (result == result2) {
            System.out.println("Вітаю ми маємо два рівносторонніх трикутника");
        } else {
            System.out.println("Що ж теж вітаю, але в нас не два рівносторонніх трикутника");
        }

    }

    private static void twoCount(int first_cool, int second_cool) {

        if (first_cool % second_cool == 0) {
            System.out.println("Ділиться без остачі");
        } else {
            System.out.println("Йо-ма-йо, є остача");
        }
    }

    private static boolean evenNumber(int first, int second) {

        if (first % 2 == 0 && second % 2 == 0) {
           return true;
        } else
            return false;
    }

    private static boolean fooCount() {

        int mas[] = {3,3,3,3};

        int result = mas[0] + mas[1] + mas[2] + mas[3];

        if (result % 2 == 0) {
            return true;
        } else
            return false;
    }

    private static void comeBack() {

        int mas[] = {1, 7, 2, 3, 2};

        String check = null;

        for (int i = 0; i <mas.length; i++) {
            if (mas[i] == mas[mas.length - i - 1]) {
                check = "Це палиндром";
            } else {
                check = "Це не палиндром";
            }
        }
        System.out.println(check);

    }

    private static void fooCountPartTwo() {

        int mas[] = {17, 23, 17, 23};

        int result = 0;
        int result2 = 0;

        result = mas[0] + mas[1];
        result2 = mas[2] + mas[3];

        if (result == result2) {
            System.out.println("Сума половини чисел однакові");
        } else {
            System.out.println("Сума половини чисел не одинакові");
        }

    }

    private static void whyBig() {

        int mas[] = {7, 3, 2, 1};

        int count = mas[0];
        int count1 = mas[1];
        int count2 = mas[2];
        int count3 = mas[3];

        if (count > count1 && count1 > count2 && count2 > count3) {
            System.out.println("Кожна цифра не менше наступної в цьому числі");
        } else {
            System.out.println("Дивись на два рядки вище, але буде навпаки");
        }

    }

    private static void quadraticEquation() {

        int a = 2;
        int b = 2;
        int c = 4;
        double x1;
        double x2;
        double dis;

        dis = Math.pow(b, 2) - (4 * a * c);
        x1 = ((-b) + Math.sqrt(dis)) / (2 * a);
        x2 = ((-b) - Math.sqrt(dis)) / (2 * a);

        System.out.println("Корінь first" + x1);
        System.out.println("Корінь second" + x2);

        if (x1 % 2 == 0 | x2 % 2 == 0) {
            System.out.println("Don't worry!!! Один із коренів є парним");
        }

    }

    private static boolean checkString(String string) {

        if (string == null) return false;
        return string.matches("^-?\\d+$");

    }

}


