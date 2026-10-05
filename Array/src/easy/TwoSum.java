package easy;

import java.util.Scanner;

public class TwoSum {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] ans = new int[2];
            for(int start =0;start < nums.length;){
                for(int end= nums.length-1 ;start<end;) {
                    if(nums[start]+nums[end]==target){
                    ans[0]= start;
                    ans[1] = end;
                    return ans;
                }
                else if(nums[start]+nums[end]!=target){
                    end--;
                }
            }
                }


            return ans;
        }


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
            TwoSum object =new TwoSum();


        }
    }
