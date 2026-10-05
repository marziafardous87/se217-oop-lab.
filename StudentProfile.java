import java.util.Scanner;

public class StudentProfile{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Student name: ");
        String studentName=sc.nextLine();

        System.out.print("Current semester: ");
        int semester=sc.nextInt();

        System.out.print("Current CGPA: ");
        double result=sc.nextDouble();
        
        System.out.println("Student: "+studentName);
        System.out.println("Semester: "+semester);
        System.out.println("CGPA: "+result);

        sc.close();
    }
}