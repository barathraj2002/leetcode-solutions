// Last updated: 3/14/2026, 11:50:24 AM
class Solution {
    public String defangIPaddr(String address) {
        
        String input = address;
        String ans  = "";
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '.'){
                String adder = "[.]";
                ans+=adder;
                continue;
            }
            ans+=input.charAt(i);
        }
        return ans;
    }
}