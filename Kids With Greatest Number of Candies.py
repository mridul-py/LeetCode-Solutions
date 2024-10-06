class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        L=[]
        Max=max(candies)
        for i in candies:
            if(i+extraCandies>=Max):
                L.append(True)
            else:
                L.append(False)
        return L
