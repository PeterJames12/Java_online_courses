package third_task;


public class PeterJames {

    public static void main(String[] args) {

        hello("Hello");

    }

    private static void hello(String hello) {

        char ch = hello.charAt(0);
        char ch1 = hello.charAt(1);
        char ch2 = hello.charAt(2);
        char ch3 = hello.charAt(3);
        char ch4 = hello.charAt(4);

        System.out.println(ch + " " + ch1 + " " + ch2 + " " + ch3 + " " + ch4);

    }

}
