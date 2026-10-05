import java.util.Arrays;
import java.util.Scanner;

public class Selection{
    public int[] SelectionSort(int[] nums){
        int n = nums.length;
        for(int i = 0;i<n; i++){
            int MinimumIndex = i;
            // find the minimum
            for( int j = i+1;j<n;j++){
                if ( nums[j] < nums[MinimumIndex]){
                    MinimumIndex =j;
                }

            }
            // swap
            int temp = nums[i];
            nums[i] = nums[MinimumIndex];
            nums[MinimumIndex]= temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 7 unsorted numbers to sort: ");
        int[] nums = new int[7];
        for(int i = 0; i< nums.length; i++){
            nums[i]= input.nextInt();
        }
        Selection object = new Selection();
        int[] ans = object.SelectionSort(nums);
        System.out.println(Arrays.toString(ans));
    }
}