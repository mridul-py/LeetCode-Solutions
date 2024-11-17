from typing import List

class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        def Sub(nums, result, current, index):
            if index == len(nums):
                if current not in result:
                    result.append(list(current))
                return
            
            # Exclude the current element
            Sub(nums, result, current, index + 1)
            
            # Include the current element
            current.append(nums[index])
            Sub(nums, result, current, index + 1)
            current.pop() 

        result = []
        nums.sort() 
        Sub(nums, result, [], 0)
        return result
