class Solution {
    public int searchInsert(int[] nums, int target) {
        int left =0;
        int right=nums.length-1;
        int f=0;
        int c=0;

        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                f=1;
                c=mid;
                break;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        if(f==1)
        return c;
        else
        return left;
    }
}
