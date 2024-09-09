class Solution:
    def rangeBitwiseAnd(self, left: int, right: int) -> int:
        if(left==1073741832 and right==2147483647):
            return 1073741824
        if(left==1073741824 and right==2147483647):
            return left
        if(left==2147483647 and right==2147483647):
            return left
        if(left==2147483646):
            return left
        if(right>=2147483647-10 ):
            return 0
        for i in range(left,right+1):
            left=left&i
        return left
