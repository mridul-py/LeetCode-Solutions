class Solution:
    def hammingWeight(self, n: int) -> int:
        D=""
        d=0
        while(n!=0):
            d=n%2
            D+=str(d)
            n=n//2
        return D.count("1")
