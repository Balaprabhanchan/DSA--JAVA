package easy;

import java.util.Scanner;

public class Consecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max =0;
        for(int i = 0; i< nums.length; i++){
           if (nums[i] == 1){
               count++;
               if (count>max) {
                   max = count;
               }
           } else if (nums[i] != 1) {
              count =0;
           }

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter an array number of 6: ");
        int[] nums = new int[6];
        for( int i =0;i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        Consecutive o = new Consecutive();
        int ans = o.findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
}
