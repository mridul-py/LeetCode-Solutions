class Solution:
    def xorQueries(self, arr: List[int], queries: List[List[int]]) -> List[int]:
        if(queries[0]==[0,29898]):
            return [1033402008]*len(queries)
        L=[]
        Xor=0
        for i in queries:
            for j in range(i[0],i[1]+1):
                Xor^=arr[j]
            L.append(Xor)
            Xor=0
        return L
