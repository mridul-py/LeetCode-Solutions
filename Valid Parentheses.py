class Solution:
    def isValid(self, s: str) -> bool:
        L = []
        for i in s:
            if i in ["(", "[", "{"]:
                L.append(i)
            elif i == ")" and L and L[-1] == "(":
                L.pop()
            elif i == "}" and L and L[-1] == "{":
                L.pop()
            elif i == "]" and L and L[-1] == "[":
                L.pop()
            else:
                return False
        return L == []
