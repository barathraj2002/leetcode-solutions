// Last updated: 3/14/2026, 11:50:43 AM
class Solution {
    int number = 0;
    public boolean isPowerOfTwo(int n) {
        int base = 2;
        while(true){
            int check = (int)Math.pow(base,number);
            if( check > n || (check <0 ) || check == Integer.MAX_VALUE ){
                return false;
            }
            else if( check == n || n == 1  ){
                return true;
            }
            else{
                number+=1;
            }
        }
        
        
    }
}