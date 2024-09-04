class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        Stack<Integer> stack= new Stack<>();
        int length=nums.length*2;
        int nums2[]=new int[length];
        int a=0;
        for(int x=0;x<length;x++)
        {
            if(x>nums.length-1)
            a=x-nums.length;
            nums2[x]=nums[a];
            a++;
        }
        int result[]=new int[nums.length];
        for(int i=nums2.length-1;i>=0;i--)
        {
            int currentIndex = i % nums.length;
            int currentValue = nums[currentIndex];
            while(!stack.isEmpty()&& nums[stack.peek()]<=currentValue)
            stack.pop();
            result[currentIndex]=stack.isEmpty()?-1:nums[stack.peek()];
           stack.push(currentIndex);
        }
        /*int result[]=new int[nums.length];
        for(int j=0;j<nums.length;j++)
        {
            result[j]=map.get(nums[j]);
        }*/
        return result;
    }
}
