// Last updated: 3/14/2026, 11:51:21 AM
class Solution {
    public int maxArea(int[] height) {
        int left = 0 ;
        int right = height.length - 1;
        int larger = Integer.MIN_VALUE;
        while(left < right){
            int width = right - left;
            int minHeight = Math.min(height[left], height[right] );
            int sum = minHeight * width;

            larger = Math.max(sum , larger);
            if(minHeight == height[left]){
                left++;
            }
            else {
                right--;
            }

        }
        return larger;
    }
}