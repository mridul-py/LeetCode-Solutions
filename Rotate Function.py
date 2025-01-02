class Solution:
    def maxRotateFunction(self, nums: List[int]) -> int:
        n = len(nums)
        Total = sum(nums)
        Sum = sum(i * nums[i] for i in range(n))
        max_value = Sum
        i = 1
        
        while i < n:
            Sum += Total - n * nums[-i]
            max_value = max(max_value, Sum)
            i += 1
        
        return max_value
