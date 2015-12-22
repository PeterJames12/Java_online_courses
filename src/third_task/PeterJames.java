package third_task;


public class PeterJames {

    public static void main(String[] args) {

        hello("Hello");//1
        System.out.println(checkInt("@"));//2
        tryGipotenysa();//3


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

}
