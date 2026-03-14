// Last updated: 3/14/2026, 11:51:10 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int[] ans = new int[]{-1,-1};
        int temp = -1;
        while(left <= right){

            int mid = left + (right - left)/2;

            if( target == nums[mid]){
                temp = mid;
                right = mid -1;
            }
            else if(nums[mid] < target){
                left = mid +1;
            }
            else if(target < nums[mid]){
                right = mid -1;
            }

//            System.out.println(temp);
            if(left >= right){
                ans[0] = temp;
            }
        }
        left = ans[0];
        right = nums.length-1;
        temp = -1;
        while(left <= right){
            if(left<0){
                break;
            }
            int mid = left + (right - left)/2;

            if( target == nums[mid]){
                temp = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target){
                left = mid +1;
            }
            else if(target < nums[mid]){
                right = mid -1;
            }

            if(left >=  right){
                ans[1] = temp;
            }
        }

        return ans;
    }
}