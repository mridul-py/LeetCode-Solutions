class Solution:
    def three_consecutive_odds(self, arr):
        c = 0
        for i in arr:
            if i % 2 != 0:
                c += 1
            else:
                c = 0
            if c == 3:
                return True
        return False
sol = Solution()
print(sol.three_consecutive_odds([1, 2, 3, 5, 7]))  # Example test case
