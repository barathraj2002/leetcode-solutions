// Last updated: 3/14/2026, 11:50:53 AM
class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high= nums.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if( nums[low] <= nums[mid] && nums[mid] <= nums[high]){
                return nums[low];
            }
            else if(nums[mid] > nums[high] ){
                low = mid +1;
            }
            else{
                high = mid;
            }
        }
       return -1;
    }
}