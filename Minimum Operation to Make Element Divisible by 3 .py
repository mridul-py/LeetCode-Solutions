class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        Count=0
        for i in nums:
            if(i%3!=0):
                Count+=1
        return Count
