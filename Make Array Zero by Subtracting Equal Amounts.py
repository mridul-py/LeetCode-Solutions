class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        if(nums == [0]):
            return 0
        Min=0
        Count=0
        while(nums.count(0)!=len(nums)):
            Min = min(num for num in nums if num > 0)
            Count+=1
            for i in range(len(nums)):
                if nums[i] > 0:
                    nums[i]-=Min
        return Count            
