class Solution:
    def toLowerCase(self, s: str) -> str:
        K=""
        for i in s:
            if(ord(i)>=97 and ord(i)<=122):
                K+=i
            elif(ord(i)>=65 and ord(i)<=90):
                K+=chr(ord(i)+32)
            else:
                K+=i
        return K
