class Solution {
    private boolean Subset(int []nums,int Size,int Sum,boolean dp[][])
    {
        for(int i=0;i<Size+1;i++)
        {
            for(int j=0;j<Sum+1;j++)
            {
                if(i==0)
                dp[i][j]=false;
                else if(j==0)
                dp[i][j]=true;
                else if(nums[i-1]<=j)
                dp[i][j]=dp[i-1][j-nums[i-1]]||dp[i-1][j];
                else
                dp[i][j]=dp[i-1][j];
            }
        }
        return dp[Size][Sum];
    }
    public boolean canPartition(int[] nums) {
        int Sum=0;
        for(int i=0;i<nums.length;i++)
        {
            Sum+=nums[i];
        }
        boolean dp[][]=new boolean[nums.length+1][Sum+1];
        if(Sum%2!=0){
            return false;
        }
        else{
           return Subset(nums,nums.length,Sum/2,dp);
        }
}
}
