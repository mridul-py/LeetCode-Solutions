class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        int count=0;
        for(int x:nums)
        {
            minHeap.add(x);
            count++;
            if(count>k)
            minHeap.poll();
        }
        return minHeap.poll();
    }
}
