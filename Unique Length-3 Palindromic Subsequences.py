class Solution:
    def countPalindromicSubsequence(self, s: str) -> int:
        C = 0
        for char in set(s):
            first = s.find(char)
            last = s.rfind(char)
            if first < last:
                unique_middle = set(s[first + 1:last])
                C += len(unique_middle)
        return C
