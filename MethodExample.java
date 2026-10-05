public class MethodExample{

    public static void main(String[] args){

        sayHello("Marzia");

        int result=getSum(25,35);

        System.out.println("Sum: "+result);

    }

    public static int getSum(int a,int b){

        return a+b;
    }

    public static void sayHello(String name){

        System.out.println("Hello, "+name+"!");

    }
}