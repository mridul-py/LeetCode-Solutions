class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
        return 0;
        int i=0;
        int c=0;
        while(i<=nums.length-1)
        {
            if(i==0)
            {
                if(nums[i]>nums[i+1])
                {
                c=i;}
            }
            else if(i>0 && i<nums.length-1)
            {
                if(nums[i-1]<nums[i]&& nums[i]>nums[i+1])
                {
                c=i;}
            }
            else if (i==nums.length-1)
            {
                if(nums[i-1]<nums[i])
                {
                c=i;}
            }
            i++;
        }
        return c;
    }
}
