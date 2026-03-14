// Last updated: 3/14/2026, 11:51:08 AM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0 ; i < strs.length; i++){
            char[] array = strs[i].toCharArray();
            Arrays.sort(array);
            String temp = String.valueOf(array);

            if(map.containsKey(temp)){
                map.get(temp).add(strs[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(temp,list);
            }
        }
        List<List<String>> ll = new ArrayList<>(map.values());
        return ll;
    }
}