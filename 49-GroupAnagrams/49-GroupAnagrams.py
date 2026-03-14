# Last updated: 3/14/2026, 4:49:58 PM
class Solution:
        def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
            anagram_dict = {}
            outer_list = []
            for word in strs:
                temp_str = ''.join(sorted(word))
                anagram_dict[temp_str] = anagram_dict.get(temp_str,[])
                anagram_dict[temp_str].append(word)
            for value in anagram_dict.values():
                outer_list.append(value)
            return outer_list
