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
    public ListNode swapNodes(ListNode head, int k) {
        int x=k;
        int Size=0;
        ListNode temp=head;
        while(temp!=null)
        {
            Size++;
            temp=temp.next;
        }
        int y=Size-k;
        int i=0;
        int j=0;
        ListNode Curr=head;
        ListNode Swap1=null;
        ListNode Swap2=null;
        while(Curr!=null)
        {
            if(i==x-1)
            {
                Swap1=Curr;
                break;
            }
            i++;
            Curr=Curr.next;
        }
        ListNode Prev=head;
        while(Prev!=null)
        {
            if(j==y)
            {
            Swap2=Prev;
            break;}
            j++;
            Prev=Prev.next;
        }
        int t=Swap1.val;
        Swap1.val=Swap2.val;
        Swap2.val=t;
        return head;
    }
}
