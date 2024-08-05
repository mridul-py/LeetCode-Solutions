class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        L=[]
        for i in arr:
            if arr.count(i)==1:
                L.append(i)
        if k> len(L):
            return ""
        else:
            return L[k-1]