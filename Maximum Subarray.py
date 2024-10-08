class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        Count=0
        Max=-inf
        for i in nums:
            Count+=i
            Max=max(Max,Count)
            if(Count<0):
                Count=0
        return Max
