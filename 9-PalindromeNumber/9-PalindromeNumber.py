# Last updated: 3/14/2026, 11:51:23 AM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0 or (x%10 ==0 and x !=0):
            return False
        else:
            rev = 0
            while x > rev:
                temp = x % 10
                rev = rev * 10 + temp
                x = x//10

            if x == rev or x == rev//10:
                return True
            else:
                return False