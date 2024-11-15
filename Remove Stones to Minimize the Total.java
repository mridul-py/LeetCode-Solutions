class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> p= new PriorityQueue<>((x, y) -> y - x);
        int a=0;
        for(int i: piles)
            p.add(i);
        while(k!=0){
            a=p.peek();
            a-=Math.floor(p.poll()/2);
            p.add(a);
            k--;
        }
        int Sum=0;
        for(int j:p)
        Sum+=j;
        return Sum;
    }
}
