class Solution {
        private int Subset(int []nums,int Size,int Sum,int dp[][])
    {
        for(int i=0;i<Size;i++)
        {
            dp[i][0]=1;
        }
        for(int i=1;i<Size+1;i++)
        {
            for(int j=0;j<Sum+1;j++)
            {
                if(nums[i-1]<=j)
                dp[i][j]=dp[i-1][j-nums[i-1]]+dp[i-1][j];
                else
                dp[i][j]=dp[i-1][j];
            }
        }
        return dp[Size][Sum];
    }
    public int findTargetSumWays(int[] nums, int target) {
       int Sum=0;
      
       for(int i=0;i<nums.length;i++)
       {
        Sum+=nums[i];
       } 
         if ((Sum + target) < 0 || (Sum + target) % 2 != 0) {
            return 0; // Check if it's possible to partition
        }
        int Sum1=(Sum+target)/2;
        if(Sum1>Sum)
        return 0;
       int dp[][]=new int[nums.length+1][Sum1+1];

       
       return Subset(nums,nums.length,Sum1,dp);
    }
}
