class Solution:
    def reverseWords(self, s: str) -> str:
        Stack=[]
        for i in range(0,len(s)):
            if(s[i].isspace()):
                Stack.append(i)
        K=s.split()
        Result=""
        length=len(K)-1
        while(length>=0):
            if(length==0):
                Result+=K[length]+""
                break
            Result+=K[length]+" "
            length-=1
        return "".join(Result)
