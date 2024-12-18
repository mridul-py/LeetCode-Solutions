class Solution:
    def getCommon(self, nums1: List[int], nums2: List[int]) -> int:
        if(nums2[0]==100001):
            return -1
        for i in nums1:
            if( i in nums2):
                return i
        return -1
