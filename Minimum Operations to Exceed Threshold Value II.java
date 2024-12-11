import java.util.PriorityQueue;

class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer((long)num);
        }
        int operations = 0;
        while (pq.peek() < k && pq.size() > 1) {
            long x = pq.poll();
            long y = pq.poll();
            operations++;
            long newValue = x *2 + y;
            pq.offer(newValue);
        }
        return operations ;
    }
}
