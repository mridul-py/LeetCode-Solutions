class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)-1):
            if target-nums[i] in nums[i+1:]:
                return [i+1,nums.index(target-nums[i] , i+1)+1]
