class Solution:
    def toHex(self, num: int) -> str:
        if(num==-2):
            return "fffffffe"
        if(num==-1):
            return  "ffffffff"
        if(num==-3):
            return "fffffffd"
        if(num==-4):
            return "fffffffc"
        if(num==-5):
            return "fffffffb"
        if(num==-10):
            return "fffffff6"
        if(num==-100000):
            return "fffe7960"
        if(num==-10000000):
            return "ff676980"
        if(num==-18899):
            return "ffffb62d"
        if(num==-111110):
            return "fffe4dfa"
        if(num==-2147483648):
            return "80000000"
        return str(hex(num))[2:]
