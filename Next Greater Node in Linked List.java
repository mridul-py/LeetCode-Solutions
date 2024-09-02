/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> L= new ArrayList<>();
        ListNode curr=head;
        while(curr!=null)
        {
            L.add(curr.val);
            curr=curr.next;
        }
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack= new Stack<>();
        int result[]=new int[L.size()];
        for(int i=L.size()-1;i>=0;i--)
        {
            int current=L.get(i);
            while(!stack.isEmpty()&&stack.peek()<=current)
            {
                stack.pop();
            }
            /*map.put(current,stack.isEmpty()?0:stack.peek());*/
            result[i]=stack.isEmpty()?0:stack.peek();
            stack.push(current);
        }
        /*ListNode temp=head;
        int j=0;
        int result[]=new int[L.size()];
        for(j=0;j<L.size();j++)
        {
            result[j]=map.get(L.get(j));
        }*/
        return result;
    }
}
