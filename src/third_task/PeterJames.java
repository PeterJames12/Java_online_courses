package third_task;


import java.util.Arrays;

public class PeterJames {

    public static void main(String[] args) {
        hello("Say Hello right now:");//1
        checkInt('5');//2
        tryGipotenysa(3, 4, 5);//3
        checkRivnobedreny(10, 10, 8);//4
        checkTwoRivnostoronuh(17, 17, 17, 23, 23, 23);//5
        twoCount(12, 23);//6
        evenNumber(17, 23);//7
        fooCount(1723);//8
        comeBack(1723);//9
        fooCountPartTwo(1723);//10
        whyBig(1723);//11
        System.out.println(quadraticEquation());//12 and 13
        System.out.println(checkString("We love Ukraine"));//14
    }

    private static void hello(String hello) {

        String say = " Hello";
        System.out.println(hello + say);

    }

    private static void checkInt(char chack) {

        int symbol = Character.getNumericValue(chack);

        switch (symbol) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Число");
                break;
            default:
                System.out.println("Це не число");
                break;
        }
    }

    private static void tryGipotenysa(int first, int second, int third) {

        transformerPartTwo(first, second, third);

            int katet1 = (int) Math.pow(first, 2);
            int katet2 = (int) Math.pow(second, 2);
            int result = (int) Math.pow(third, 2);

            if (katet1 + katet2 == result) {
                System.out.println("Трикутник прямокутний");
            } else {
                System.out.println("Трикутник якійсь інший");
            }
    }

    private static void checkRivnobedreny(int storona1, int storona2, int storona3) {

        transformerPartTwo(storona1,storona2,storona3);

            if (storona1 == storona2 && storona3 < storona1 || storona3 < storona2 && storona3 > 0) {
                System.out.println("Трикутник рівнобедрений");
            } else {
                System.out.println("Трикутник не рівнобедрений");
            }
        }

    private static void checkTwoRivnostoronuh(int one, int two, int three, int foo, int five, int six) {

        transformerPartTwo(one,two,three);
        transformerPartTwo(foo,five,six);

            String result = null;

            String result2 = null;

            if (one == two && three == (two + one + three) / 3) {
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
        } else {
            return false;
        }
    }

    private static void fooCount(int girls) {

        int arr[] = new int[4];

        transformer(arr, girls);

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        if (result % 2 == 0) {
            System.out.println("Сума парна");
        } else {
            System.out.println("Сума не парна");
        }
    }

    private static void comeBack(int friend) {

        int mas[] = new int[4];

        transformer(mas, friend);

        String check = null;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == mas[mas.length - i - 1]) {
                check = "Це палиндром";
            } else {
                check = "Це не палиндром";
            }
        }
        System.out.println(check);
    }

    private static void fooCountPartTwo(int part) {

        int mas[] = new int[4];

        transformer(mas, part);

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

    private static void whyBig(int joy) {

        int mas[] = new int[4];

        transformer(mas, joy);

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

    private static String quadraticEquation() {

        int a = 2;
        double b = 16;
        double c = 14;
        double x1;
        double x2;
        double dis;

        dis = (Math.pow(b, 2)) - (4 * a * c);
        x1 = ((b) + Math.sqrt(dis)) / (2 * a);
        x2 = ((b) - Math.sqrt(dis)) / (2 * a);

        double mas[] = new double[2];
        mas[0] = x1;
        mas[1] = x2;

        checkParn(x1, x2);

        return Arrays.toString(mas);
    }

    private static void checkParn(double x1, double x2) {

        if (x1 % 2 == 0 | x2 % 2 == 0) {
            System.out.println("Don't worry!!! Один із коренів є парним");
        } else {
            System.out.println("Не парний");
        }
    }

    private static boolean checkString(String string) {

        if (string == null) return false;
        return string.matches("^-?\\d+$");
    }

    private static void transformer(int[] mas, int all) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = all % 10;
            all /= 10;
        }
    }

    private static void transformerPartTwo(int first, int second, int third) {

        if (first + second > third && first + third > second && third + second > first) {
            System.out.println("Трикутник існує");
        } else {
            System.out.println("Це не трикутник");
        }
    }
}



