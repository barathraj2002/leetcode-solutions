// Last updated: 3/14/2026, 11:50:37 AM
class Solution {
    public void reverseString(char[] s) {
  
        
        int start = 0;
        int end = s.length - 1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            
            start++; end--;
        }
    }
}
      