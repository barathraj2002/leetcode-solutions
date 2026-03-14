// Last updated: 3/14/2026, 11:51:01 AM
class Solution {
    public boolean isPalindrome(String s) {
        String temp = "";
        for(int i = 0 ; i < s.length() ; i++){
            if( (s.charAt(i) >= '0' && s.charAt(i) <= '9' ) || (s.charAt(i) >= 'a' && 
            s.charAt(i)<= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' )){
                temp+= String.valueOf(s.charAt(i));
            }
        }
        temp = temp.toLowerCase();
        int start = 0;
        int end = temp.length()-1;
        System.out.println(temp);
        while(start < end){
            if(temp.charAt(start) == temp.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}