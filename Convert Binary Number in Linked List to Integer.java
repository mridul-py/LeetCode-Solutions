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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int Size=0;
        while(temp!=null)
        {
            Size++;
            temp=temp.next;
        }
        int Power=Size-1;
        ListNode curr=head;
        int Binary=0;
        while(curr!=null)
        {
            Binary+=curr.val*Math.pow(2,Power);
            Power--;
            curr=curr.next;
        }
        return Binary;
    }
}
