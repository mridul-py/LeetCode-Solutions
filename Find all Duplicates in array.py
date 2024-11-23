class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        a = len(nums) - 1
        duplicates = []
        for i in range(len(nums)):
            index = abs(nums[i]) - 1
            if nums[index] < 0:
                duplicates.append(abs(nums[i]))
            else:
                nums[index] *= -1
        return duplicates
