class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        L=[]
        d=[]
        def Permutation(start=0):
            
                if(start==len(nums)):
                    L.append(nums[:])
                else:
                    for i in range(start,len(nums)):
                        nums[i],nums[start]=nums[start],nums[i]
                        Permutation(start+1)
                        nums[i],nums[start]=nums[start],nums[i]
        Permutation()
        return L
