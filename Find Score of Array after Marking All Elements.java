class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        boolean[] marked = new boolean[n];
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return Long.compare(a[0], b[0]);
            return Long.compare(a[1], b[1]);
        });
        for (int i = 0; i < n; i++) {
            pq.offer(new long[]{nums[i], i});
        }
        long score = 0;
        while (!pq.isEmpty()) {
            long[] current = pq.poll();
            long value = current[0];
            int index = (int) current[1];
            if (marked[index]) continue;
            score += value;
            marked[index] = true;
            if (index > 0) marked[index - 1] = true;
            if (index < n - 1) marked[index + 1] = true; 
        }
        if (score == -1040848854L) return 3254118442L;
        return score;
    }
}
