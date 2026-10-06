import java.util.Arrays;
import java.util.Scanner;

public class Insertion {

        public int[] insertionSort(int[] nums){
            int n = nums.length;
            for(int i = 0; i<=n-1;i++){
                int j = i;
                while((j>0 )&& (nums[j-1] > nums[j])){
                    // swap
                    int temp= nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    j--;
                }
            }
            return nums;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a 7 unsorted numbers for insertion sort: ");
            int[] nums = new int[7];
            for(int i = 0; i< nums.length; i++){
                nums[i]= input.nextInt();
            }
            Insertion object = new Insertion();
            int[] ans = object.insertionSort(nums);
            System.out.println(Arrays.toString(ans));
        }
    }