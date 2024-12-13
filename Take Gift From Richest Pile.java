class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Long> pq= new PriorityQueue<>((a,b)-> Long.compare(b, a));
        for(int i:gifts)
        pq.add((long)i);
        while(k!=0){
            long Largest=pq.poll();
            pq.add((long)Math.sqrt(Largest));
            k--;
        }
        long Sum=0;
        for(long j:pq)
        Sum+=j;
        return Sum;
    }
}
