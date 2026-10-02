package easy;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        int [] temp = new int[n];
        k = k % n;
        int j =0;
        for(int i = n-k ;i < n ; i++ ){
            temp[j] = nums[i];
            j++;
        }
        for(int i =0 ; i<n-k;i++)   {
            temp[i+k]= nums[i];

        }
        System.arraycopy(temp, 0, nums, 0, n);

        System.out.print(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "enter an array number of 7: ");
        int[] nums = new int[7];
        for( int i =0;i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println("enter K rounds ");
        int k = input.nextInt();
        RotateArray object =new RotateArray();
        object.rotate(nums, k);

    }
}
