public class SwitchDemo{
    public static void main(String[] args){

        char choice='b';

        switch(choice){

            case 'a':
                System.out.println("Apple");
                break;

            case 'b':
                System.out.println("Bangladesh");
                break;

            case 'c':
                System.out.println("Canada");
                break;

            default:
                System.out.println("Invalid choice");
        }

    }
}