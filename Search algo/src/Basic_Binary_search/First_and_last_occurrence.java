package Basic_Binary_search;

import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = first_occurrence(nums, target);
        ans[1] = last_occurrence( nums, target);
        return ans;
    }
    public int first_occurrence(int[] nums, int target){
        int low = 0;
        int high = nums.length -1;
        int first = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                first = mid;
                high = mid - 1;
            }
            else if(nums[mid] > target ){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return first;
    }

    public int last_occurrence(int[] nums, int target){
        int low = 0;
        int high = nums.length -1;
        int last = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                last = mid;
                low = mid + 1;
            }
            else if(nums[mid] > target ){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return last;
    }
}

public class First_and_last_occurrence {
    public static void main(String[] args) {
        int[] nums = {23, 34, 38, 49, 49, 49, 90};
        int target = 49;
        Solution obj = new Solution();
        int[] ans = obj.searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

}


