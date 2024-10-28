import sys
from typing import List

sys.set_int_max_str_digits(100000)

class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        K = ""
        for i in num:
            K += str(i)
        
        Sum = int(K) + k
        L = [int(i) for i in str(Sum)]
        
        return L
