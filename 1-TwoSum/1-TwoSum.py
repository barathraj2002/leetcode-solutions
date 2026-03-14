# Last updated: 3/14/2026, 11:51:27 AM
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map= {}
        for i in range(0, len(nums)):
            temp = target - nums[i]
            if temp in map:
                return [i,map.get(temp)]
            else:
                map[nums[i]] = i