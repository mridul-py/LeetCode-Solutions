class Solution:
    def findComplement(self, num: int) -> int:
        s=""
        d=0
        complement=""
        Decimal=0
        digit=0
        while(num!=0):
            d=num%2
            s+=str(d)
            num=num//2
        for i in s:
            if(i=="0"):
                complement+="1"
            elif(i=="1"):
                complement+="0"
        for i in complement:
            Decimal+=int(i)*2**digit
            digit+=1
        return Decimal
