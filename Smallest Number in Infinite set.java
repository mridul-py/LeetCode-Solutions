class SmallestInfiniteSet {
    List<Integer> p;
    PriorityQueue<Integer> L;
    private int currentSmallest;
    
    public SmallestInfiniteSet() {
        p = new ArrayList<>();
        L = new PriorityQueue<>();
        currentSmallest = 1;
    }
    
    public int popSmallest() {
        if (!L.isEmpty()) {
            return L.poll();
        }
        return currentSmallest++;
    }
    
    public void addBack(int num) {
        if (num < currentSmallest && !L.contains(num)) {
            L.add(num);
        }
    }
}
