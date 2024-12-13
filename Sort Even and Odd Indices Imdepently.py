class Solution:
    def sortEvenOdd(self, nums: List[int]) -> List[int]:
        Even = [nums[i] for i in range(len(nums)) if i % 2 == 0] 
        Odd = [nums[i] for i in range(len(nums)) if i % 2 == 1] 
        Even.sort()
        Odd.sort(reverse=True)
        Count=0
        even=0
        odd=0
        for i in range(len(nums)):
            if(i%2==0):
                nums[i]=Even[even]
                even+=1
            else:
                nums[i]=Odd[odd]
                odd+=1
        return nums
