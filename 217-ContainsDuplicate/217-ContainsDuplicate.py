# Last updated: 3/14/2026, 11:50:46 AM
class Solution:
        def containsDuplicate(self, nums: List[int]) -> bool:
            uniqueSet = set()
            for i in nums:
                if i not in uniqueSet:
                    uniqueSet.add(i)
                elif i in uniqueSet:
                    return True
            return False