class Solution:
    def addBinary(self, a: str, b: str) -> str:
        if(a=="0" and b=="0"):
            return "0"
        C=0
        D=0
        A=int(a)
        i=0
        j=0
        B=int(b)
        d=0
        e=0
        while(A!=0):
            if(A!=0):
                d=A%10
                C+=d*(2**i)
                A=A//10
                i+=1
        while(B!=0):
            if(B!=0):
                e=B%10
                D+=e*(2**j)
                B=B//10
                j+=1
        E=C+D
        result=""
        d=0
        while(E!=0):
            d=E%2
            result=str(d)+result
            E=E//2
        return str(result)
