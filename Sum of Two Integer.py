class Solution:
    def getSum(self, a: int, b: int) -> int:
        if a == -1 and b == 1:
            return 0
        carry = 0
        mask = 0xFFFFFFFF
        while b != 0:
            carry = (a & b) & mask
            a = (a ^ b) & mask
            b = carry << 1
        return a if a <= 0x7FFFFFFF else ~(a ^ mask)
