class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        l=0
        r=len(letters)-1
        if(target<letters[0] or target >=letters[r]):
            return letters[0]

        while l<=r:
            mid=(l+r)//2
            if(letters[mid]<=target):
                l=mid+1
            elif(letters[mid]>target):
                r=mid-1
        return letters[l]