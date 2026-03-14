// Last updated: 3/14/2026, 11:51:06 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0 , j = i+1;
        int count = 1;
        int changer = 0;
        while(i < nums.length - 2 && j <= nums.length - 1){
            int temp = nums[i];
            if(nums[i] == nums[j]){
                if( nums[j] == temp){
                    if(count < 2){
                        count++;
                        j++;
                    }
                    else{
                        nums[j] = Integer.MAX_VALUE;
                        changer++;
                        j++;
                        if(j <= nums.length - 1 && nums[j] == nums[i]){
                            nums[j] = Integer.MAX_VALUE;
                            changer++;
                            j++;
                        }
                        else {
                            i = j;
                            j = i + 1;
                            count = 1;

                        }
                    }
                }
                else {
                    i = j;
                    j = i+1;
                    count = 1;
                }
            }
            else{
                i = j;
                j = i+1;
                count = 1;
            }
        }
        Arrays.sort(nums);
        return nums.length - changer;
    }
}