import java.util.Arrays;
import java.util.Scanner;

public class P1 {
    
    
public static void main(String[] args) {
    int [] num = new int  [10];
    Scanner in = new Scanner(System.in);
    for(int i = 0;i< num.length;i++){
        num[i]=i;
        System.out.printf(" " + num[i]);
    }
    System.out.printf("%n"+Arrays.toString(num));
    System.out.print("enter numbers: ");
    //input array from user
    int[] arr = new int[10];
    for (int j =0; j< arr.length; j++){
        arr[j] = in.nextInt();
    }
    System.out.println(arr.length);
    System.out.println(Arrays.toString(arr));
    in.close();
}


}