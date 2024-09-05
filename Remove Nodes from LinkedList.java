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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=head;
        Stack<Integer> stack=new Stack<>();
        List<Integer> L= new ArrayList<>();
        List<Integer> L2=new ArrayList<>();
        ListNode result=new ListNode();
        ListNode current=result;
        while(temp!=null)
        {
            L.add(temp.val);
            temp=temp.next;
        }
        for(int i=L.size()-1;i>=0;i--)
        {
            int current1=L.get(i);
            while(!stack.isEmpty()&&stack.peek()<=current1)
            stack.pop();
            if(stack.isEmpty())
            L2.add(current1);
            stack.push(current1);
        }
        Collections.reverse(L2);
        for(int x :L2)
        {
            ListNode node=new ListNode(x);
                current.next=node;
                current=node;
        }
        return result.next;
    }
}
