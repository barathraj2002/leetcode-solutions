// Last updated: 3/14/2026, 11:50:17 AM
class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i = 0 ; i< words.length -1 ; i++){
            for(int j = i+1 ; j < words.length ; j++){
                if(words[i].length() > words[j].length() ){
                    continue;
                }
                
                if(words[j].startsWith(words[i]) && words[j].endsWith(words[i]) ){
                    count++;
                }
            }
        }
        return count;
    }
}