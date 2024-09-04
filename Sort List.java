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
    public ListNode sortList(ListNode head) {
        List<Integer> L=new  ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            L.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(L);
        ListNode current=head;
        int i=0;
        while(current!=null)
        {
            current.val=L.get(i);
            i++;
            current=current.next;
        }
        return head;
    }
}
