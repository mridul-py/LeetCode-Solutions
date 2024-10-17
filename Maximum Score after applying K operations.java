class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums)
        p.add(i);
        int e=0;
        long Score=0;
        while(k>0){
            e=p.poll();
            Score+=e;
            p.add((int)Math.ceil(e/3.0));
            k--;
        }
        return Score;
    }
}
