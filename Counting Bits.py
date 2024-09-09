class Solution:
    def countBits(self, n: int) -> List[int]:
        a=0
        d=0
        L=[]
        Count=0
        for i in range(0,n+1):
            Count=0
            a=i
            if(a==0):
                L.append(0)
            else:
                while(a!=0):
                    d=a%2
                    if(d==1):
                        Count+=1
                    a=a//2
                L.append(Count)
        return L


