// Last updated: 3/14/2026, 11:50:19 AM
class Solution {
    public String transformer(String str ){
        String str1 = "";
        for(int i = 0 ; i < str.length();i++){
            String temp = str.charAt(i) +""+ (char)(str.charAt(i) +1);
            str1+=temp;
        }
        return str1;
    }
    public char kthCharacter(int k) {
         String s = "a";
        while(s.length() < k){
            s = transformer(s);
        }
        return s.charAt(k-1);
    }
}