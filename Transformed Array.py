class Solution:
    def constructTransformedArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        Result = [0] * n
        for i in range(n):
            if nums[i] == 0:
                Result[i] = nums[i] 
            else:
                steps = nums[i]
                new_index = (i + steps) % n 
                Result[i] = nums[new_index]
        
        return Result
