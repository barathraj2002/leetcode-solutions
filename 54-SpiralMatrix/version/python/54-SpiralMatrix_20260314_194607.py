# Last updated: 3/14/2026, 7:46:07 PM
'''
For any element at index 
i
i
, the answer is simply the product of everything to its left multiplied by everything to its right.
The first pass (left-to-right) fills the array with the Prefix Product, which is the cumulative product of all elements appearing before index 
i
i
.
The second pass (right-to-left) calculates the Suffix Product using a rolling variable (common) to represent all elements appearing after index 
i
i
.
By multiplying the stored prefix product by the moving suffix product, you get the total product for each index while effectively "skipping" the current element.
'''

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