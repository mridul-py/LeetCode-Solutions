class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        C=0
        d=0
        for i in words:
            for j in i:
                if(j in allowed):
                    C+=1
            if(C==len(i)):
                d+=1
                C=0
            else:
                C=0
        return d
