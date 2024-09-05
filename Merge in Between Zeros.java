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
    public ListNode mergeNodes(ListNode head) {
        ListNode result=new ListNode(0);
        ListNode current=result;
        ListNode temp=head;
        int Sum=0;
        while(temp!=null)
        {
            if(temp.val!=0)
            {
                Sum+=temp.val;
            }
            else if(temp.val==0)
            {
                ListNode node= new ListNode(Sum);
                current.next=node;
                current=node;
                Sum=0;
            }
            temp=temp.next;
        }
        return result.next.next;
    }
}
