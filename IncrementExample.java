public class IncrementExample {
    
    public static void main(String[] args) {

        int x = 5;

        System.out.println("Original value: " + x);
        System.out.println("Post-increment: " + x++);
        System.out.println("After post-increment: " + x);

        System.out.println("Pre-increment: " + (++x));
        System.out.println("Final value: " + x);

    }
}
