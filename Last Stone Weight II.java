class Solution {
    private int StonePick(int stones[],int Index,int Left,int Right,Integer dp[][])
{
    if(Index==stones.length)
    return Math.abs(Left-Right);
    if(dp[Index][Left] != null){
    return dp[Index][Left];}
    dp[Index][Left]=Math.min(StonePick(stones,Index+1,Left+stones[Index],Right,dp),StonePick(stones,Index+1,Left,Right+stones[Index],dp));
    return dp[Index][Left];
}
    public int lastStoneWeightII(int[] stones) {
        int Sum=0;
        for(int i=0;i<stones.length;i++)
        {
            Sum+=stones[i];
        }
        Integer dp[][]=new Integer[stones.length+1][Sum+1];
        return StonePick(stones,0,0,0,dp);
    }
}
