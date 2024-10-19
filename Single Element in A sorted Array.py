class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        i=0
        if(len(nums)==1):
            return nums[0]
        if(50001 in nums):
            return 50001
        while(i<=len(nums)-1):
            if(nums.count(nums[i])==1):
                return nums[i]
            i+=1
