class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        d= dict(Counter(nums))
        for i,v in d.items():
            if(d[i]>=2):
                return True
        return False
