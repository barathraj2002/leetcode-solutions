// Last updated: 3/14/2026, 11:50:33 AM
class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        if (n == 0){
             return 0;
        }
        for(int i = 1; i<=n ; i++ ){
            if(n-i >=0){
                count++;
                n=n-i;
            }
            else{
                break;
            }
        }
        return count;
    }
}