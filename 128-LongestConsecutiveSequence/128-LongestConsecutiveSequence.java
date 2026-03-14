// Last updated: 3/14/2026, 11:51:00 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int largest = 0;
        for (Integer i : set) {
            int count = 1;
            if(!set.contains(i-1)){
                while(true){
                    if(set.contains(i +1 )){
                        count++;
                        i++;
                    }
                    else {
                        break;
                    }
                }
            }
            largest = Math.max(largest,count);
        }
        return largest;
    }
}