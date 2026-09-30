import java.util.Arrays;
import java.util.Scanner;

public class TwoD_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number of matrix : ");
        int two [][]= new int[3][3];
        //input
        for(int i = 0;i < two.length; i++){
            for(int j = 0;j < two[i].length; j++){
                two[i][j] = input.nextInt();
            }
        } 
        // output1
        for(int i = 0;i < two.length; i++){
            System.out.println(Arrays.toString(two[i]));
        }
        //output2
        for (int[] row : two) {
           System.out.printf("%n"+ Arrays.toString(row)); 
        }
        input.close();
    } 
    
}
