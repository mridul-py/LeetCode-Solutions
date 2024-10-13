class Solution:
    def generateKey(self, num1: int, num2: int, num3: int) -> int:
        a = str(num1)
        b = str(num2)
        c = str(num3)
        if len(a) < 4:
            a = "0" * (4 - len(a)) + a
        if len(b) < 4:
            b = "0" * (4 - len(b)) + b
        if len(c) < 4:
            c = "0" * (4 - len(c)) + c

        key = ""
        i = 0
        j = 0
        k = 0
        while i < len(a) or j < len(b) or k < len(c):
            current_digits = []
            if i < len(a):
                current_digits.append(a[i])
            if j < len(b):
                current_digits.append(b[j])
            if k < len(c):
                current_digits.append(c[k])

            key += min(current_digits)

            if i < len(a):
                i += 1
            if j < len(b):
                j += 1
            if k < len(c):
                k += 1

        return int(key)
