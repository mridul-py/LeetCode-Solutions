class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) 
        map.put(c,map.getOrDefault(c, 0)+1);
        PriorityQueue<Character> L= new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(char c: map.keySet())
        L.add(c);
        String result="";
        while(!L.isEmpty())
        {
            char cd=L.poll();
            int Count=map.get(cd);
            for(int j=0;j<Count;j++)
            result+=cd;
        }
        return result;
    }
}
