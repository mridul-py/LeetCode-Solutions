class Solution:
    def getLucky(self, s: str, k: int) -> int:
        NumberString=""
        for i in s:
            NumberString+=str(ord(i)-96)
        a=int(NumberString)
        d=0
        Sum=0
        for i in range(1,k+1):
            while(a!=0):
                d=a%10
                Sum+=d
                a=a//10
            if(i==k):
                break
            else:
                a=Sum
                Sum=0
        return Sum
