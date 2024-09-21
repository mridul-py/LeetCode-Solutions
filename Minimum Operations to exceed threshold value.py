class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        minOperations=0
        for i in nums:
            if(i<k):
                minOperations+=1
        return minOperations
