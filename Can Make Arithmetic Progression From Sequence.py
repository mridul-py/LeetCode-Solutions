class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        arr.sort()
        A=arr[1]-arr[0]
        i=0
        while(i!=len(arr)-1):
            if(arr[i+1]-arr[i]==A):
                F=1
            else:
                F=0
                break
            i+=1
        if(F==1):
            return True
        else:
            return False
