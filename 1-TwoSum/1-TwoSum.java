// Last updated: 3/14/2026, 11:51:28 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                return new int[]{i, map.get(temp)};
            }
            else{
                map.put(nums[i], i);
            }
        }

        return null;
    }
}