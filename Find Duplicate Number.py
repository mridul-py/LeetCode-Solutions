class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        Single=set()
        for i in nums:
            if(i in Single):
                return i
            Single.add(i)
