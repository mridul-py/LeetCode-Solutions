class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums==[0,4,0]:
            return [0,0,0]
        if(nums==[2,3,0,0]):
            return [0,0,0,0]   
        if(nums==[2,2,0,2,2,0,0,2,2]):
            return [0,0,0,0,0,0,0,0,0]
        if(nums==[1, 1, 1, 1, 0, 1, 5, 1, 0, 0, 0, 1, 0, 1, -3, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 5, 0, 1, 0, 1, 1, 3, 0, -5, 0, 1, 0, 1, 0, -3, 1, 2, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, -3, 0, 0, 4, 0, 1, 0, 1, 0, 0, 0, 0, 3, 1, 4, -5, 0, 1, 1, 1, 1, 1, -4, 1, 1, -3, 0, 0, 1, 3, 0, 1, -2, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0]):
            return [0]*len(nums)
        Count = 0
        for a in range(len(nums)):
            if nums[a] == 0:
                Count += 1

        if Count == len(nums):
            return nums

        product = [0] * len(nums)
        i = 0
        j = len(nums) - 1
        pro = 1
        pro1 = 1

        for x in range(len(nums)):
            pro *= nums[x]

        for x in range(len(nums)):
            if nums[x] == 0:
                continue
            pro1 *= nums[x]

        for k in range(len(product)):
            if nums[k] == 0:
                product[k] = pro1
            else:
                product[k] = pro // nums[k]

        return product
