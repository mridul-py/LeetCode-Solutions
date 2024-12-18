class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int arr[] = new int[nums.length];
        for (int num : nums) {
            minHeap.add(num);
        }
        int index = 0;
        while (!minHeap.isEmpty()) {
            int a = minHeap.poll();
            if (!minHeap.isEmpty()) {
                int b = minHeap.poll();
                arr[index++] = b;
                arr[index++] = a;
            } else {
                arr[index++] = a;
            }
        }
        return arr;
    }
}
