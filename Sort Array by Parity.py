class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        if(nums==[0]):
            return [0]
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
        while(a<=len(Even)-1):
            Result.append(Even[a])
            a+=1
        while(b<=len(Odd)-1):
            Result.append(Odd[b])
            b+=1
        return Result
    
