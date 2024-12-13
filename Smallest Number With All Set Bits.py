class Solution:
    def smallestNumber(self, n: int) -> int:
        b = n.bit_length()
        return (1 << b) - 1 
