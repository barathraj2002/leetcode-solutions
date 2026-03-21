# Last updated: 3/21/2026, 4:41:05 PM
class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        if len(nums) == 3 and sum(nums) == 0:
            return [nums]
        nums.sort()
        triplets_list = set()
        for i in range(len(nums)):
            if i>0 and nums[i] == nums[i - 1]:
                continue

            left = i + 1
            right = len(nums) - 1
            while left < right:
                current_sum = nums[i] + nums[left] + nums[right]
                if current_sum == 0 and left < right:
                    triplets_list.add((nums[i], nums[left], nums[right]))
                    left += 1
                    right -= 1
                elif current_sum > 0:
                    right -= 1
                elif current_sum < 0:
                    left += 1

        return list(triplets_list)