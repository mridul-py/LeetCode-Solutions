
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        int count[]=new int[temperatures.length];
        for(int i=0;i<=temperatures.length-1;i++)
        map.put(temperatures[i],i);
        for (int i=temperatures.length-1;i>=0;i--)
        {
            int current=temperatures[i];
            while(!stack.isEmpty()&& temperatures[stack.peek()]<=current)
            stack.pop();
            count[i]=stack.isEmpty()?0:stack.peek()-i;
            stack.push(i);
        }
        return count;
    }
}
