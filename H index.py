from typing import List

class Solution:
    def hIndex(self, citations: List[int]) -> int:
        citations.sort()
        n = len(citations)
        start, end = 0, n
        
        while start < end:
            mid = (start + end) // 2
            if citations[mid] >= n - mid:
                end = mid
            else:
                start = mid + 1
        
        return n - start
