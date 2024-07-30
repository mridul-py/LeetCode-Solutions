class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:

        # '0' for left side, '1' for right side
        left = self.binarySearch(nums, target, 0)
        right = self.binarySearch(nums, target, 1)
        return [left, right]

    def binarySearch(self, nums, target, side):
        left, right = 0, len(nums) - 1
        index = -1
        while left <= right:

            mid = (left + right) // 2

            if target > nums[mid]:
                left = mid + 1
            elif target < nums[mid]:
                right = mid - 1
            else:
                index = mid
                if side == 0:
                    right = mid - 1
                else:
                    left = mid + 1
        return index
