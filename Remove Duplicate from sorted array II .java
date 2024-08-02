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
    public ListNode deleteDuplicates(ListNode head) {
        List<Integer> L= new ArrayList<>();
        List<Integer> Unique= new ArrayList<>();
        while(head!=null){
            L.add(head.val);
            head=head.next;
        }
        for (int i : L){
            if(L.indexOf(i)==L.lastIndexOf(i))
            Unique.add(i);
        }
        ListNode result= new ListNode(0);
        ListNode temp=result;
        for (int i : Unique){
            ListNode node = new ListNode(i);
            temp.next=node;
            temp=temp.next;
        }
        return result.next;
    }
}
