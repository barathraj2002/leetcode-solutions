# Last updated: 3/14/2026, 11:51:14 AM
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 0
        for fast in range(1,len(nums)):
            if nums[fast] !=nums[slow] and nums[fast] > nums[slow]:
                temp = nums[fast]
                nums[fast] = nums[slow+1]
                nums[slow+1] = temp
                slow +=1
        #print(nums)
        return slow+1