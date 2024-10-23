class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        L=[]
        for i in s:
            if(i.isalpha()):
                L.append(i)
        L=L[::-1]
        Result=""
        a=0
        for j in s:
            if(j.isalpha()):
                Result+=L[a]
                a+=1
            else:
                Result+=j
        return Result
