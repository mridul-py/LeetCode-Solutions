class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        Result=[]
        for i in range (len(words)):
            for j in range(len(words)):
                if(words[i] ==words[j]):
                    continue
                if(words[i] in words[j]):
                    Result.append(words[i])
                    break
        return Result
