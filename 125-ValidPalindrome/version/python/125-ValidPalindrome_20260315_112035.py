# Last updated: 3/15/2026, 11:20:35 AM
1class Solution:
2        def isPalindrome(self, s: str) -> bool:
3            temp_Str = ""
4            s = s.lower()
5            for ch in s:
6                if ch >= "a" and ch<="z" or ch >= "0" and ch <= "9":
7                    temp_Str +=ch
8            left = 0
9            right = len(temp_Str)-1
10
11            while(left < right):
12                if temp_Str[left] == temp_Str[right]:
13                    left+=1
14                    right-=1
15                    continue
16                else:
17                    return False
18
19            return True