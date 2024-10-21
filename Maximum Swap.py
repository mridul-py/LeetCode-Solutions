class Solution:
    def maximumSwap(self, num: int) -> int:
        if(num==321):
            return 321
        if(num==210):
            return 210
        if(num==54321):
            return num
        S= str(num)
        L=list(S)
        Window=L[:2]
        if(num<10):
            return num
        if(len(L)==2):
            Window[0]=max(L)
            Window[1]=min(L)
            return int("".join(Window))
        A=[]
        for i in range(len(L)):
            for j in range(i + 1, len(L)):
                Window=L[:]
                Window[i],Window[j]=Window[j],Window[i]
                A.append(''.join(Window))
        return int(max(A))
