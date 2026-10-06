import java.util.Arrays;
import java.util.Scanner;

public class Bubble {

    public int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for(int i = n-1;i>= 1;i--){
            for(int j = 0; j<=i-1;j++){
                if(nums[j]>nums[j+1]){
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 7 unsorted numbers for Bubble: ");
        int[] nums = new int[7];
        for(int i = 0; i< nums.length; i++){
            nums[i]= input.nextInt();
        }
        Bubble object = new Bubble();
        int[] ans = object.bubbleSort(nums);
        System.out.println(Arrays.toString(ans));
    }
}
