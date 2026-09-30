import java.util.Arrays;
import java.util.Scanner;

public class Concatenation {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int m = 2*n;
        int ans[] = new int[m];
        for (int i = 0; i< n; i++){
            ans[i]=nums[i];
            ans[i + n] =nums[i];
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 array number");
        int [] nums = new int[5];
        for(int i = 0; i< nums.length;i++){
            nums[i]= input.nextInt();
        }
        Concatenation o = new Concatenation();
        int [] ans = o.getConcatenation(nums);
        System.out.println( Arrays.toString(ans));
        input.close();
        
    }
}


