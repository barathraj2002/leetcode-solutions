// Last updated: 3/14/2026, 11:50:28 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high= 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < piles.length ; i++){
            high = Math.max(high , piles[i]);
        }
        while(low <= high){
            int mid = (low + high) / 2 ;
            int totalHrs = hoursFinder(piles , mid);
            if(totalHrs > h){

                low = mid + 1;
            }
            else if( totalHrs < h){
                ans = Math.min(ans , mid);
                high = mid - 1;
            }
            else{
                ans = Math.min(ans , mid);
                high = mid - 1;
            }

        }

        return ans;
    }
    public static int hoursFinder(int[] arr, int speed){
        int hrs = 0;
        for(int i = 0 ; i< arr.length ; i++){
            hrs += Math.ceil((double) arr[i] / speed);
        }
        return hrs;
    }
}