class Solution:
    def secondsToRemoveOccurrences(self, s: str) -> int:
        C = 0
        while "01" in s:
            s = s.replace("01", "10")
            C += 1
        return C
