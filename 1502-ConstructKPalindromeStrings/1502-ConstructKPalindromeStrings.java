// Last updated: 3/14/2026, 11:50:21 AM
class Solution {
    public static boolean canConstruct(String s, int k) {
        boolean bool = false;

        if(k>s.length() || k == 0){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        int oddCount = 0;

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()%2 !=0){
                oddCount+=1;
            }
        }


        if((1 <= oddCount ) && oddCount<=k){
            bool = true;
        }
        else if(oddCount == 0){
            if( (1 <= k) && (k <= s.length())){
                return true;
            }
            else{
                return false;
            }
        }

        return bool;
    }
}