# Last updated: 3/15/2026, 11:37:15 AM
class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        setArray= set()
        count = 1
        for i in nums:
            setArray.add(i)
        for nums in setArray:
            if nums - 1 in setArray:
                continue
            else:
                tempCount = 1
                while True:
                    if nums + 1 in setArray:
                        tempCount+=1
                        nums+=1
                    else:
                        break
                if count < tempCount:
                    count = tempCount


        return count