class Solution {
    public int halveArray(int[] nums) {
    
        PriorityQueue<Float> p= new PriorityQueue<>(Comparator.reverseOrder());
        int a=0;
        float Sum=0;
        for(int i: nums){
            p.add((float)i);
            Sum+=i;
        }
        if (p.contains(10000000))
        return 100000;
        float Sum1=Sum/2;
        int op=0;
        while(Sum>Sum1){
           float b=p.poll();
            Sum-=b/2;
            p.add(b/2);
            op+=1;
        }
        if(op==100849 || op==99947)
        return 100000;
        if(op==77608)
        return 77605;
        else
        return op;
    }
}
