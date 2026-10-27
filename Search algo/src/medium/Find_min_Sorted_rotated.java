package medium;

public class Find_min_Sorted_rotated {

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while ( low <= high ){
            int mid = low + (high - low) / 2;
            if(nums[low] <= nums[mid]){
                if(nums[low] <= min){
                    min = nums[low];
                }
                low = mid + 1;
            }
            else{
                if(nums[mid] < min) {
                    min = nums[mid];
                }

                high = mid -1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] nums = { 4 , 5, 6, 7, 1,2 , 3};
        Find_min_Sorted_rotated obj = new Find_min_Sorted_rotated();
        System.out.println(obj.findMin(nums));
    }
}
