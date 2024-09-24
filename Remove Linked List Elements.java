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
    public ListNode removeElements(ListNode head, int val) {
        List<Integer> L=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            L.add(temp.val);
            temp=temp.next;
        }
        ListNode result=new ListNode(0);
        ListNode current=result;
        for(int i:L)
        {
            if(i!=val)
            {
                ListNode node=new ListNode(i);
                current.next=node;
                current=node;
            }
        }
        return result.next;
    }
}
