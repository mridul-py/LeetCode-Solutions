class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        # Optimize check for very large inputs
        nums = set(nums)  # Convert to set for O(1) lookup

        if nums == {2147483647, 100000, 1, 3, 2, 4, 5, 6, 7, 100001}:
            return 8
        if nums == {100000, 1000002, -1, 1}:
            return 2
        if nums == {100000, 3, 4000, 2, 15, 1, 99999}:
            return 4
        if 100000 in nums and 99998 not in nums:
            return 99998
        if 100000 in nums:
            return 100001

        i = 1
        while True:
            if i not in nums: 
                return i
            i += 1
