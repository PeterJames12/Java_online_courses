package third_task;


public class Test3 {

    public static void main(String[] args) {
        int ageGirl = 20;

        Years(ageGirl);
    }

    private static void Years(int ageGirl) {

        switch (ageGirl){

            case 18 :
                System.out.println("I think you yet a little girl"); //Sorry for my english)
                break;
            case 19 :
                System.out.println("I think you pretty girl");
                break;
            case 20 :
                System.out.println("I think you good-looking");
                break;
        }

    }

}
