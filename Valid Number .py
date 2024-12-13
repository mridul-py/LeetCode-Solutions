import re

class Solution:
    def isNumber(self, s: str) -> bool:
        # Regular expression for a valid number
        pattern = r'^[+-]?(\d+(\.\d*)?|\.\d+)([eE][+-]?\d+)?$'
        return bool(re.match(pattern, s))
