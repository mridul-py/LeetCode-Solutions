import java.util.PriorityQueue;

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        // PriorityQueue stores character and its count (count descending)
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[1] - x[1]);
        
        if (a > 0) pq.add(new int[]{'a', a});
        if (b > 0) pq.add(new int[]{'b', b});
        if (c > 0) pq.add(new int[]{'c', c});
        
        StringBuilder result = new StringBuilder();
        
        while (!pq.isEmpty()) {

            int[] first = pq.poll();
            char ch1 = (char) first[0];
            int count1 = first[1];

            int len = result.length();
            if (len >= 2 && result.charAt(len - 1) == ch1 && result.charAt(len - 2) == ch1) {
                if (pq.isEmpty()) break; 
                int[] second = pq.poll();
                char ch2 = (char) second[0];
                int count2 = second[1];
                result.append(ch2);
                count2--;

                pq.add(first);

                if (count2 > 0) pq.add(new int[]{ch2, count2});
            } else {

                result.append(ch1);
                count1--;

                if (count1 > 0) pq.add(new int[]{ch1, count1});
            }
        }
        
        return result.toString();
    }
}
