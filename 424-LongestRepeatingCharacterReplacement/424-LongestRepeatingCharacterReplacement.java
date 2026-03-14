// Last updated: 3/14/2026, 11:50:34 AM
class Solution {
    public int characterReplacement(String s, int k) {
        int[] fmap = new int[26];
        int l = 0 , r = 0, maxLen=  0;
        int maxFreq = 0;
        while(r <= s.length() - 1){
            fmap[s.charAt(r) - 'A']++;
            int temp = fmap[s.charAt(r) - 'A'];
            maxFreq = Math.max(temp , maxFreq);

            if((r - l + 1) - maxFreq <= k){
                maxLen = Math.max(maxLen , (r - l + 1));
                r++;
            }
            else if((r - l + 1) - maxFreq > k){
                fmap[s.charAt(l) - 'A']--;
                l++;
                fmap[s.charAt(r) - 'A']--;
            }
            else if( (r - l + 1) <= maxLen){
                break;
            }
        }
        return maxLen;
    }
}