// Last updated: 3/14/2026, 11:51:19 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
       String a = "";
        String ans = "";
        for(int i = 0 ; i< strs.length; i++){
            if(strs[i].isEmpty()){
                return "";
            }
            if(i+1 == strs.length){
                a = (a.length() < strs[strs.length-1].length())? a : strs[strs.length-1];
                break;
            }
            if(strs[i].length() < strs[i+1].length()){
                String temp = strs[i];
                if(a.isEmpty()){
                    a = temp;
                }
                else if (a.length() > temp.length()){
                    a = temp;
                }
            }
            else{
                String temp = strs[i];
                if(a.isEmpty()){
                    a = temp;
                }
                else if (a.length() > temp.length()){
                    a = temp;
                }
            }
        }
        if(strs.length == 1){
            a = strs[0];
        }

        boolean bool = true;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if(strs[j].charAt(i) == a.charAt(i)){
                    continue;
                }
                else {
                    bool = false;
                }
            }
            if(!bool){
                break;
            }
            else {
                ans = ans + a.charAt(i);
            }
        }
        return ans;
    }
}