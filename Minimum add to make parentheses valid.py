class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        count=0
        count1=0
        if s=="":
            return 0
        for i in s:
            if i =="(":
                count+=1
            elif(count):
                count-=1
            else:
                count1+=1
        return count1+count
