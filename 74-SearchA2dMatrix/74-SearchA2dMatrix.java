// Last updated: 3/14/2026, 11:51:07 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 1 && matrix[0].length == 1){
            if(matrix[0][0] == target){
                return true;
            }
            else{
                return false;
            }
        }
        int low = 0;
        int high = matrix.length -1 ;

        while(low < high){
            int mid = (low + high) / 2;
            int lastEle = matrix[mid][matrix[mid].length - 1];
            if(lastEle == target){
                return true;
            }
            else if (lastEle > target){
                high = mid;
            }
            else{
                if(low == mid){
                    low++;
                }
                else{
                    low = mid;
                }
            }
        }

        int low1 = 0;
        int high1 = matrix[low].length - 1 ;

        while(low1 <= high1){
            int mid = (low1 + high1) / 2;


            if(matrix[low][mid] == target){
                return true;
            }
            else if(matrix[low][mid] > target){
                high1 = mid - 1;
            }
            else{
                low1 = mid + 1;
            }

        }
        return false;
    }
}