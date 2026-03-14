// Last updated: 3/14/2026, 11:50:50 AM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int left = 0;
       int right = numbers.length -1;
        int a = 0 ;
        int b = 0;
       while(left < right){
        if(numbers[left] + numbers[right] == target){
            a=left +1;
            b = right+1;
            break;
        }
        else if(numbers[left] + numbers[right] > target){
            right--;
        }
        else{
            left++;
        }
       }
       return new int[]{a,b};
        
    }
}