import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Merge_Algo {

     // merge code
     public void merge(int low, int high, int mid, int[]nums){
          ArrayList<Integer> temp = new ArrayList<>();
          int left = low;
          int right = mid+1;
          while((left<= mid)&&(right<=high)){
               if(nums[left]<= nums[right]){
                    temp.add(nums[left]);
                    left++;
               }
               else{
                    temp.add(nums[right]);
                    right++;
               }
               }

               while(left<= mid) {
                         temp.add(nums[left]);
                         left++;
               }

               while(right<= high) {
                         temp.add(nums[right]);
                         right++;
               }
               for( int i = low;i<=high;i++ ){
                    nums[i] = temp.get(i-low);
          }
     }
     public int[] Mergesort(int low,int high, int[] nums){
          if(low>= high){
               return nums;
          }
          int mid = (low+high)/2;
          Mergesort(low,mid,nums);
          Mergesort(mid+1,high, nums);
          merge(low,high,mid,nums);
          return nums;
     }


     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int[] nums = new int[7];
          System.out.println("Enter a 7 numbers for merge sort: ");
          for( int i = 0; i < nums.length;i++ ){
               nums[i]= input.nextInt();
          }
          Merge_Algo obj = new Merge_Algo();
          obj.Mergesort(0,nums.length-1,nums);
          System.out.println(Arrays.toString(nums));
     }
}
