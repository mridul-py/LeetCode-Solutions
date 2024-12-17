class Solution:
    def sortArrayByParityII(self, nums: List[int]) -> List[int]:
        Odd=[]
        Even=[]
        for i in nums:
            if(i%2==0):
                Even.append(i)
            else:
                Odd.append(i)
        Result=[]
        a=0
        b=0
        for i in range(len(nums)):
            if(i%2==0):
                Result.append(Even[a])
                a+=1
            else:
                Result.append(Odd[b])
                b+=1
        return Result
    
