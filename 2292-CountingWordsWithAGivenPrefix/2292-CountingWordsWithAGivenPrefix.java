// Last updated: 3/14/2026, 11:50:20 AM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;

        for(int i = 0 ; i< words.length ; i++){
            if(words[i].length() < pref.length()){
                System.out.println(i);
                continue;
            }
            else{
                String temp = words[i].substring(0,pref.length());
                System.out.println(temp +" "+ pref);
                if(pref.equals(temp)){
                    System.out.println(i);
                    count++;
                }
                System.out.println("eeee "+count);
            }
        }

            return count;
    }
}