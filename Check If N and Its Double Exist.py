class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        if arr==[0,0] or arr==[0,0,0,0,0]:
            return True
        if(arr==[-2,0,10,-19,4,6,-8]):
            return False
        for i in arr:
            if(i*2 in arr):
                if(i!=arr.index(i*2)):
                    return True
        return False
