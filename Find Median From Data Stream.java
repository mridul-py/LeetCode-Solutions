class MedianFinder {
    
    private PriorityQueue<Integer> low;
    
    private PriorityQueue<Integer> high;

    public MedianFinder() {
        low = new PriorityQueue<>((a, b) -> b - a); // Max heap
        high = new PriorityQueue<>(); // Min heap
    }

    public void addNum(int num) {
       
        low.offer(num);

        high.offer(low.poll());

        if (low.size() < high.size()) {
            low.offer(high.poll());
        }
    }

    public double findMedian() {
        if (low.size() > high.size()) {
            return low.peek(); 
        } else {
            return (low.peek() + high.peek()) / 2.0; 
        }
    }
}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
