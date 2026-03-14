# Last updated: 3/14/2026, 12:28:29 PM
class Solution:
        def isAnagram(self, s: str, t: str) -> bool:
            if len(s) != len(t):
                return False
            dict_1 = {}
            dict_2 = {}

            for i , j in zip(s , t) :
                dict_1[i] = dict_1.get(i,0) +1
                dict_2[j] = dict_2.get(j,0) + 1
            if dict_1 == dict_2:
                return True
        
            return False