// Last updated: 3/14/2026, 11:51:11 AM
class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;

        while(low <= high ){
            int mid = (low + high) / 2;

            if(nums[mid] == target){
                return mid;
            }

            else if( nums[low] <= nums[mid]){
                if((nums[low] <= target && target <= nums[mid])){
                    high = mid;
                }
                else{
                    low = mid +1;
                }
            }
            else if( nums[mid] < nums[high]){
                if((nums[mid] <= target && target <= nums[high])){
                    low = mid;
                }
                else{
                    high = mid -1;
                }
            }
        }

        return -1;
    }
}