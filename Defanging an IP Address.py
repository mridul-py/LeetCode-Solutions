class Solution:
    def defangIPaddr(self, address: str) -> str:
        K=""
        for i in address:
            if(i!="."):
                K+=i
            else:
                K+="[.]"
        return K
