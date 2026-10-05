public class StringExample2{
    public static void main(String[] args){

        String firstName="Nabila Ahmed";

        System.out.println("Original: "+firstName);
        System.out.println("Total characters: "+firstName.length());
        System.out.println("Capital letters: "+firstName.toUpperCase());
        System.out.println("Small letters: "+firstName.toLowerCase());
        System.out.println("First character: "+firstName.charAt(0));

        String secondName="Marzia Fardous";

        if(firstName.equals(secondName)){
            System.out.println("Names are same.");
        }
        else{
            System.out.println("Names are not same.");
        }
    }
}