class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        L=s1.split()
        L1=s2.split()
        Result=[]
        for i in L:
            if(L.count(i)==1 and i not in L1):
                Result.append(i)
        for i in L1:
            if(L1.count(i)==1 and i not in L):
                Result.append(i)
        return Result
