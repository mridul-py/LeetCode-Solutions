class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        a = num
        Sum = 0
        if num==1:
            return False
        for i in range(1, int(math.sqrt(num)) + 1):
            if num % i == 0:
                Sum += i
                if i != 1 and i != num // i:
                    Sum += num // i    
        if Sum == a:
            return True
        else:
            return False
