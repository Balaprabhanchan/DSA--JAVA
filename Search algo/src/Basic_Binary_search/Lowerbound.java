package Basic_Binary_search;

import java.util.Scanner;

public class Lowerbound {

    public int lowerBound(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = n;

        while(low <= high) {

            int mid = (low+high)/2;

            if (nums[mid] >= x){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter array of 7 for lowe bound: ");
        int[] nums = new int[7];
        for(int i = 0; i< nums.length; i++){
            nums[i]= input.nextInt();
        }
        System.out.println(" enter target: ");
        int x = input.nextInt();
        Lowerbound object = new Lowerbound();
        int ans = object.lowerBound(nums,x);
        System.out.println(ans);
    }
}

