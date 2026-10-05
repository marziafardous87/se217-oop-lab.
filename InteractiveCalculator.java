import java.util.Scanner;

public class InteractiveCalculator{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double num1=sc.nextDouble();

        System.out.print("Enter number 2: ");
        double num2=sc.nextDouble();

        System.out.println("\nSelect operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Choice: ");
        int option=sc.nextInt();

        switch(option){
            case 1:
                System.out.println("Answer: "+(num1+num2));
                break;

            case 2:
                System.out.println("Answer: "+(num1-num2));
                break;

            case 3:
                System.out.println("Answer: "+(num1*num2));
                break;

            case 4:
                if(num2==0){
                    System.out.println("Division by zero is not possible.");
                }
                else{
                    System.out.println("Answer: "+(num1/num2));
                }
                break;

            default:
                System.out.println("Please select a valid option.");
        }

        sc.close();
    }
}