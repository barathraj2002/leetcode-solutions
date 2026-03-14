// Last updated: 3/14/2026, 11:51:18 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }
        int val = 0;
        boolean flag = false;
        for(int i = 0 ; i < nums.length -1;i++){
            for (int j = i+1; j < nums.length; j++) {

                if(nums[i] != nums[j] && nums[i] < nums[j]){
                    int temp = nums[i+1];
                    nums[i+1] = nums[j];
                    nums[j] = temp;
                    val++;
                    if (j == nums.length -1){
                        val++;
                        flag = true;
                    }
                    break;
                }
                if (j == nums.length -1){
                    val++;
                    flag = true;
                }

            }
            if(flag) break;

        }
        return val;
    }
}