// Last updated: 3/14/2026, 11:50:41 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre = 1;
        int post = 1;

        int[] prearr = new int [nums.length];
        int[] postarr = new int [nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            if(i == 0){
                prearr[i] = nums[i] * pre;
            }
            else{
                prearr[i] = nums[i] * prearr[i-1];
            }
        }

        for(int i = postarr.length -1 ; i > 0 ; i--){
            if(i == postarr.length -1){
                postarr[i] = nums[i] * post;
            }
            else{
                postarr[i] = nums[i] * postarr[i+1];
            }
        }

        for(int i = 0 ; i< nums.length ; i++){
            if(i == 0){
                nums[i] = pre * postarr[i+1];
            }
            else if(i > 0 && i < nums.length-1){
                nums[i] = prearr[i-1] * postarr[i+1];
            }
            else if( i == nums.length -1){
                nums[i] = prearr[i-1] * post;
            }
        }
        return nums;
    }
}