class Solution:
    def minimumSteps(self, s: str) -> int:
        ones_count = 0
        swaps = 0
        for char in s:
            if char == '1':
                ones_count += 1
            elif char == '0' and ones_count > 0:
                swaps += ones_count
        
        return swaps
