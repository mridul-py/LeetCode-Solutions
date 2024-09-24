class Solution:
    def reverseWords(self, s: str) -> str:
        L=s.split()
        A=[]
        for i in L:
            A.append(i[::-1])
        return " ".join(A)
