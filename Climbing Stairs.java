/**
 * Question   : Climbing Stairs
 * Complexity : Time: O(2^n) ; Space: O(n)
 */
class Solution {
    public static int [][]dp=new int[46][46];
    private int CountStairs(int n){

        if(n==1)
        return n;
        if(n==2)
        return 2;
        if(dp[2][n]!=-1)
        return dp[2][n];
        else
        dp[2][n]=CountStairs(n-1)+CountStairs(n-2);
        return dp[2][n];
    }
    public int climbStairs(int n) {
        for (int i=0;i<46;i++)
        {
            for (int j=0;j<46;j++)
            {
                dp[i][j]=-1;
            }
        }
        return CountStairs(n);
    }
}
