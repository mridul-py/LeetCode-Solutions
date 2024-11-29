class Solution:
    def isBalanced(self, num: str) -> bool:
        Count=0
        So=0
        Se=0
        for i in num:
            Count+=1
            if(Count%2!=0):
                So+=int(i)
            else:
                Se+=int(i)
        if(So==Se):
            return True
        else:
            return False
            
