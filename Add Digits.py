class Solution:
    def addDigits(self, num: int) -> int:
        Sum = 0
        d = 0
        while num >= 10:
            while num > 0:
                d = num % 10
                Sum += d
                num = num // 10
            num = Sum
            Sum = 0
        return num
