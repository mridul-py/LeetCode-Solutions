class Solution:
    def getFinalState(self, nums: List[int], k: int, multiplier: int) -> List[int]:
        while(k!=0):
            Min=min(nums)
            nums[nums.index(Min)]*=multiplier
            k-=1
        return nums
