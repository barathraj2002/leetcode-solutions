// Last updated: 3/14/2026, 11:50:26 AM
class Solution {
     public static boolean check(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            int w1 = map1.getOrDefault(entry.getKey(), 0);
            int w2 = entry.getValue();
            if (w2 > w1) {
                return false;
            }
        }
        return true;
    }

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> answer = new ArrayList<>();

        // Step 1: Build the frequency map for words2 (combined requirement map)
        HashMap<Character, Integer> requiredMap = new HashMap<>();
        for (String word : words2) {
            HashMap<Character, Integer> tempMap = new HashMap<>();
            for (char c : word.toCharArray()) {
                tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);
            }

            // Update requiredMap to keep the max frequency of each character
            for (Map.Entry<Character, Integer> entry : tempMap.entrySet()) {
                requiredMap.put(entry.getKey(), Math.max(requiredMap.getOrDefault(entry.getKey(), 0), entry.getValue()));
            }
        }

        // Step 2: Check each word in words1
        for (String word : words1) {
            HashMap<Character, Integer> wordMap = new HashMap<>();
            for (char c : word.toCharArray()) {
                wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
            }

            // Step 3: Check if the word meets the required frequency map
            if (check(wordMap, requiredMap)) {
                answer.add(word);
            }
        }

        return answer;
    }
}