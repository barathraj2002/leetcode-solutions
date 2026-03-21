# Last updated: 3/21/2026, 4:40:43 PM
class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left = 0
        right = len(numbers)-1

        while left < right:
            if numbers[left] + numbers[right] == target:
                return [left+1, right+1]
            elif numbers[left] + numbers[right] >target:
                right -=1
            elif numbers[left] + numbers[right] < target:
                left+=1;
    