class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(String str : strs){
            int C = 0;
            int J = 0;
            
            for(char c : str.toCharArray()){
                if(c == '0') C++;
                else J++;
            }
        for(int i= m;i>=C;i--)
        {
            for(int j=n;j>=J;j--)
            {
                dp[i][j]=Math.max(dp[i][j],dp[i-C][j-J]+1);
            }
        }
        
    }
    return dp[m][n];
    }
    }
