import java.util.Arrays;
import java.util.Scanner;

class Sumof1DArray {
    public int[] runningSum(int[] nums) {
        
        int[] runningSum = new int[nums.length];
        runningSum[0]= nums[0];
        for(int i = 1; i < runningSum.length; i++){
            runningSum[i] = runningSum[i-1] + nums[i];
        }
        return runningSum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 5 number: ");
        int[] nums = new int[5];
        for( int i =0 ; i < nums.length; i++){
            nums[i] = input.nextInt();
        }
        input.close();
        Sumof1DArray o = new Sumof1DArray();
        int ans[] = o.runningSum(nums);
        System.out.println(Arrays.toString(ans));

    }
}