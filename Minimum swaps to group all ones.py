class Solution:
    def minSwaps(self, nums: List[int]) -> int:

        #         Let's denote the number of ones in the array nums with k.
        # Then we need to find a circular subarray of nums, of length k such that its fill is maximal. The reason is that, if we choose that window to place all ones into, then the number of swaps is exactly k - the number of ones in that window.

        k = sum(nums)
        ones = sum(nums[-k:])
        max_fill = ones
        for i in range(len(nums)):
            ones += nums[i] - nums[i - k]
            if ones > max_fill:
                max_fill = ones
        return k - max_fill


