class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        L=0
        U=0
        for i in word:
            if(i.isupper()):
                L+=1
            if(i.islower()):
                U+=1
        if(L==1 and word[0].isupper()):
            return True
        if(L==len(word)):
            return True
        if(U==len(word)):
            return True
        
