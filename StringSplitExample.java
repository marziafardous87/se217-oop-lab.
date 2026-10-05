public class StringSplitExample{
    public static void main(String[] args){

        String text="Java is easy to learn";

        String words[]=text.split(" ");

        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
    }
}