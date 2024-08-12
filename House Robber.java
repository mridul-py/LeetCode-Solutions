class Solution {
    private static int dp[]=new int [1001];
    private int take(int nums[],int i,int n)
    {
        if(i>=nums.length)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        dp[i]=Math.max(nums[i]+take(nums,i+2,nums.length),take(nums,i+1,nums.length));
        return dp[i];
    }
    public int rob(int[] nums) {
        for (int i=0;i <1001;i++)
        dp[i]=-1;
        return take(nums,0,nums.length);
    }
}
