class Solution:
    def maxScore(self, s: str) -> int:
        Score=[]
        zero=[]
        one=[]
        Window=[]
        for i in range(1,len(s)):
            Window=s[:i]
            zero=Window.count('0')
            one=s[i:].count('1')
            Score.append(zero+one)
        return max(Score)
