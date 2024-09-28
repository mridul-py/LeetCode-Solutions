class Solution {
    private int MinSum(int grid[][],int m,int n ,int i,int j,int dp[][]){
        if(i==m&&j==n)
        return grid[m][n];
        else if(i>m||j>n)
        return Integer.MAX_VALUE;
        else if(dp[i][j]!=0)
        return dp[i][j];
        else
        {
            return dp[i][j]=grid[i][j]+Math.min(MinSum(grid,m,n,i+1,j,dp),MinSum(grid,m,n,i,j+1,dp));
        }
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        return MinSum(grid,m-1,n-1,0,0,dp);
    }
}
