# Last updated: 3/14/2026, 9:44:51 PM
1class Solution:
2    def longestConsecutive(self, nums: List[int]) -> int:
3        if len(nums) == 0:
4            return 0
5        setArray= set()
6        count = 1
7        for i in nums:
8            setArray.add(i)
9        for nums in setArray:
10            if nums - 1 in setArray:
11                continue
12            else:
13                tempCount = 1
14                while True:
15                    if nums + 1 in setArray:
16                        tempCount+=1
17                        nums+=1
18                    else:
19                        break
20                if count < tempCount:
21                    count = tempCount
22
23
24        return count