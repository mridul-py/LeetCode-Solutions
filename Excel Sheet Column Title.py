class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        result = []
        while columnNumber > 0:
            columnNumber -= 1  # Adjust because Excel columns are 1-based
            remainder = columnNumber % 26
            result.append(chr(remainder + 65))  # Convert remainder to corresponding letter
            columnNumber //= 26  # Move to the next "digit"
        return ''.join(reversed(result))  # Reverse to get the correct order
