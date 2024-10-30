import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> L= new PriorityQueue<>();
        int Count=0;
        for(String i: nums)
        {
            L.add(new BigInteger(i));
                Count++;
                if(Count>k)
                L.poll();
        }
        return L.poll().toString();
    }
}
