# Last updated: 3/14/2026, 7:53:26 PM
1class Solution:
2       def productExceptSelf(self, nums: List[int]) -> List[int]:
3            common = 1
4            ans = []
5            ans.append(common)
6            for i in range(len(nums)):
7                if i > 0:
8                    ans.append(ans[i-1] * nums[i-1])
9
10            for i in range(len(nums)-1, -1 , -1 ):
11                if i == len(nums)-1:
12                    ans[i] = common * ans[i]
13                else:
14                    common = common *nums[i+1]
15                    ans[i] = common * ans[i]
16            return ans