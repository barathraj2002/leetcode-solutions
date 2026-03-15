# Last updated: 3/15/2026, 11:36:06 AM
class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = ''.join(filter(str.isalnum, s))
        s = s.lower()
        
        return s == s[::-1]