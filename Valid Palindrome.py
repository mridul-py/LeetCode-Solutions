class Solution:
    def isPalindrome(self, s: str) -> bool:
        S=""
        for i in s:
            if(i.isalnum()):
                S+=i.lower()
        if(S==S[::-1]):
            return True
        else:
            return False
