package third_task;


public class PeterJames {

    public static void main(String[] args) {

        hello("Hello");//1
        System.out.println(checkInt("12"));//2
        tryGipotenysa();//3
        checkRivnobedreny();//4
        checkTwoRivnostoronuh();//5
    }

    private static void hello(String hello) {

        char ch = hello.charAt(0);
        char ch1 = hello.charAt(1);
        char ch2 = hello.charAt(2);
        char ch3 = hello.charAt(3);
        char ch4 = hello.charAt(4);

        System.out.println(ch + " " + ch1 + " " + ch2 + " " + ch3 + " " + ch4);

    }

    private static boolean checkInt(String string) {

        if (string == null) return false;
        return true;
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

}
