class Solution:
    def addSpaces(self, s: str, spaces: list[int]) -> str:
        L = ""
        space_set = set(spaces)
        for i in range(len(s)):
            if i in space_set:
                L += " "
            L += s[i]
        return L
