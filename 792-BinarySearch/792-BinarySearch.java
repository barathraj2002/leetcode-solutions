// Last updated: 3/14/2026, 11:50:30 AM
class Solution {
    public int find(int[] arr, int low, int high, int target){
        if(low > high){
            return -1;
        }
        int mid = (low + high) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] < target){
            return find(arr , mid +1 , high , target);
        }
        return find(arr , low , mid-1 , target);
    }
    public int search(int[] nums, int target) {
        return find(nums , 0 , nums.length-1 , target);
    }
}