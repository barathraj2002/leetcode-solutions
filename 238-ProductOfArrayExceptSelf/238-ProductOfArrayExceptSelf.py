# Last updated: 3/14/2026, 9:12:21 PM
class Solution:
       def productExceptSelf(self, nums: List[int]) -> List[int]:
            common = 1
            ans = []
            ans.append(common)
            for i in range(len(nums)):
                if i > 0:
                    ans.append(ans[i-1] * nums[i-1])

            for i in range(len(nums)-1, -1 , -1 ):
                if i == len(nums)-1:
                    ans[i] = common * ans[i]
                else:
                    common = common *nums[i+1]
                    ans[i] = common * ans[i]
            return ans