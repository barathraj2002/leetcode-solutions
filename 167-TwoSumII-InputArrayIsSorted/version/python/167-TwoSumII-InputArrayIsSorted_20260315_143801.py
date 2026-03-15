# Last updated: 3/15/2026, 2:38:01 PM
1class Solution:
2    def threeSum(self, nums: list[int]) -> list[list[int]]:
3        if len(nums) == 3 and sum(nums) == 0:
4            return [nums]
5        nums.sort()
6        triplets_list = set()
7        for i in range(len(nums) - 3):
8            left = i + 1
9            right = len(nums) - 1
10            while left < right:
11                current_sum = nums[i] + nums[left] + nums[right]
12                if current_sum == 0 and left < right :
13                    triplets_list.add((nums[i], nums[left], nums[right]))
14                    left+=1
15                    right-=1
16                elif current_sum > 0 and left < right:
17                    right -= 1
18                elif current_sum < 0 and left < right:
19                    left += 1
20
21        return list(triplets_list)
22
23