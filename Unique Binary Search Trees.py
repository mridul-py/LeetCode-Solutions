class Solution:
    def numTrees(self, n: int) -> int:
        #Number of Unique Binary Trees that can be formed =2n!/(n+1)!*n!
        def fact(n):
            f=1
            for i in range(1,n+1):
                f=f*i
            return f
        a=fact(2*n)
        b=fact(n+1)
        c=fact(n)
        d=b*c
        return(a//d)