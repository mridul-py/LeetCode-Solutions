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
    public int ListSize(ListNode head){
       
        int Size=0;
        while(head!=null){
            Size+=1;
            head=head.next;
        }
        return Size;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp1= new ListNode(-1,head);
        ListNode temp2=temp1;
        int length=ListSize(head);
        for (int i=0;i<n;i++){
            
            head=head.next;
        }
        while(head!=null){
            head=head.next;
            temp2=temp2.next;
        }
        temp2.next=temp2.next.next;
        return temp1.next;
    }
}
