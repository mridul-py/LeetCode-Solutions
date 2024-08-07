class Solution:
    def numberToWords(self, num: int) -> str:
        if num == 0:
            return 'Zero'
        nums = {0: '', 1: 'One', 2: 'Two', 3: 'Three', 4: 'Four', 5: 'Five', 6: 'Six', 7: 'Seven', 8: 'Eight', 9: 'Nine'}
        decs = {2: 'Twenty', 3: 'Thirty', 4: 'Forty', 5: 'Fifty', 6: 'Sixty', 7: 'Seventy', 8: 'Eighty', 9: 'Ninety'}
        tens = {0: 'Ten', 1:'Eleven', 2: 'Twelve', 3: 'Thirteen', 4: 'Fourteen', 5: 'Fifteen', 6: 'Sixteen', 7: 'Seventeen', 8: 'Eighteen', 9: 'Nineteen'}
        # Function to convert numbers < 1000 to words
        def hundreds(x):
            res = []
            h = x // 100
            x %= 100
            if h > 0:
                res.append(nums[h])
                res.append('Hundred')
            d = x // 10
            x %= 10
            if d > 1:
                res.append(decs[d])
                res.append(nums[x])
            elif d == 1:
                res.append(tens[x])
            else:
                res.append(nums[x])
            return res

        # Main conversion function
        def convert_chunk(num, unit):
            if num:
                res.extend(hundreds(num))
                if unit:
                    res.append(unit)

        # Initialize result list
        res = []

        # Break the number into billions, millions, thousands, and the rest
        convert_chunk(num // 1000000000, 'Billion')
        num %= 1000000000
        convert_chunk(num // 1000000, 'Million')
        num %= 1000000
        convert_chunk(num // 1000, 'Thousand')
        num %= 1000
        convert_chunk(num, '')

        return ' '.join([i for i in res if i])
print(Solution().numberToWords(12345678))