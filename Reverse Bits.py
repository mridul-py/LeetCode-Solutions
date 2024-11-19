class Solution:
    def reverseBits(self, n: int) -> int:
        a = bin(n)[2:].zfill(32)[::-1] 
        B = int(a, 2)
        return B
