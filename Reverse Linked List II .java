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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> L= new ArrayList<>();
        while(head!=null){
            L.add(head.val);
            head=head.next;
        }
        List<Integer> Sub = L.subList(left-1,right);
        Collections.reverse(Sub);
        ListNode result= new ListNode(0);
        ListNode temp= result;
        for (int i : L){
            ListNode node = new ListNode(i);
            temp.next=node;
            temp=temp.next;
        }
        return result.next;
    }
}
