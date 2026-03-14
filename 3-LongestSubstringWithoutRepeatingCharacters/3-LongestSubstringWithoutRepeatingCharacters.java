// Last updated: 3/14/2026, 11:51:24 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int remover = 0;
        int largestLen = 0;
        for(int i = 0 ; i < s.length() ; i++){
            while(set.contains(s.charAt(i))){
                largestLen = Math.max(largestLen , set.size());
                set.remove(s.charAt(remover));
                remover++;
            }
            set.add(s.charAt(i));
            largestLen = Math.max(largestLen , set.size());
        }

        return largestLen;
    }
}