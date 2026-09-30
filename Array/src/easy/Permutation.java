import java.util.Arrays;
import java.util.Scanner;

class Permutation {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        for(int i = 0; i < ans.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(" enter 6 numbers: ");
        Scanner input = new Scanner(System.in);
        int [] nums = new int[6];
        for(int i = 0; i< nums.length;i++){
            nums[i]= input.nextInt();}
        Permutation obj = new Permutation();
        int[] ans= obj.buildArray(nums);
        input.close();
        System.out.println(Arrays.toString(ans));
    }
}
