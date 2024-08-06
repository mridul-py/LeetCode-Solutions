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
    private int getSize(ListNode head){
        ListNode temp=head;
        int Size=0;
        while(temp!=null){
            Size++;
            temp=temp.next;
        }
        return Size;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null||head==null)
        return null;
        int S=getSize(head);
        int L=0;
        int middle= S/2;
        int mid=(int)Math.ceil(middle);
        int Count=0;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            if(Count==middle){
                prev.next=temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
            Count++;
        }
        return head;
    }
}
