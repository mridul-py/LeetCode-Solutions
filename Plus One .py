class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        K=""
        for i in digits:
            K+=str(i)
        d=int(K)
        K=str(d+1)
        digits=[]
        for i in K:
            digits.append(int(i))
        return digits
        
