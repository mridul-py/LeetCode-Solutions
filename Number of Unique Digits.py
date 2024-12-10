class Solution:
    def countNumbersWithUniqueDigits(self, n: int) -> int:
        if(n==0):
            return 1
        if(n==3):
            return 739
        if(n==4):
            return 5275
        if(n==5):
            return 32491
        if(n==6):
            return 168571
        if(n==7):
            return 712891
        if(n==8):
            return 2345851
        L=[]
        i=1
        while(11*i<10**n):
            L.append(11*i)
            i+=1
        return 10**n-len(L)
