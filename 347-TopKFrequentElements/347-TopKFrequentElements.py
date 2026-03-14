# Last updated: 3/14/2026, 9:12:17 PM
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter = Counter(nums)
        heap = []
        
        for key, val in counter.items():
            heapq.heappush(heap, (-val, key))
        
        res = [] 
        for i in range(k):
            _, key = heapq.heappop(heap)
            res.append(key)
            
        return res
