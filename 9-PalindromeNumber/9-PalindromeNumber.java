// Last updated: 3/14/2026, 11:51:26 AM
class Solution {
    public boolean isPalindrome(int x) {
        int a = 0, b = x;
        while(b > 0){
            a = a*10 + b%10;
            b /= 10;
        }
        return x == a; 
    }
}




    