class Solution:
    def maximumGap(self, nums: List[int]) -> int:
        if(len(nums)<2):
            return 0
        nums.sort()
        Max=0
        diff=0
        for i in range(len(nums)-1):
            diff=abs(nums[i]-nums[i+1])
            Max=max(Max,diff)
        return Max
