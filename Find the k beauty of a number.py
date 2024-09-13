class Solution:
    def divisorSubstrings(self, num: int, k: int) -> int:
        a=str(num)
        C=0
        K=""
        i=0
        j=k
        for i in range(0,len(a)-k+1):
            K=a[i:k+i]
            if(K=="0"*k):
                continue
            if(num%int(K)==0):
                C+=1
            i+=1
        return C
