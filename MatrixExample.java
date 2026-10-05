public class MatrixExample{
    public static void main(String[] args){

        int matrix[][]={
            {10,20,30},
            {40,50,60}
        };

        int sum=0;

        for(int i=0;i<2;i++){

            for(int j=0;j<3;j++){

                sum=sum+matrix[i][j];
            }
        }

        double average=sum/6.0;

        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);

    }
}