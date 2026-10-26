package Basic_Binary_search;

public class Binary_search_findx {

        public int search(int[] nums, int target) {
            int low = 0;
            int high = nums.length-1;
            while (low <= high){
                int mid = (low+high)/2;
                if ( nums[mid]== target ){
                    return mid;
                }
                else if (nums[mid]<target) {
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            return -1;
        }

        public static void main(String[] args) {

            int[] nums = {10, 20, 30, 40, 50, 60, 70};
            int target = 50;

            Binary_search_findx obj = new Binary_search_findx();

            int ans = obj.search(nums, target);

            System.out.println("Index: " + ans);
        }
    }


