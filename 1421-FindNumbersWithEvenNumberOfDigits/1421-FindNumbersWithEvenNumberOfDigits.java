// Last updated: 3/14/2026, 11:50:23 AM
class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0 ; 
        for(int i =0 ; i< nums.length;i++){
            String a = String.valueOf(nums[i]);
            if(a.length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}