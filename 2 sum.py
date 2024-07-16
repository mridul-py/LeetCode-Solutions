def twoSum(nums, target):
    for i in range(len(nums)):
        complement = target - nums[i]
        if complement in nums[i+1:]:
            return [i, nums.index(complement, i+1)]

# Test the function
nums = [3, 2, 3]
target = 6
print(twoSum(nums, target))  # Output: [0, 2]

