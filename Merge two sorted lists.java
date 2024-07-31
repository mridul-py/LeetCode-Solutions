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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> L= new ArrayList<>();
        while(list1!=null){
        L.add(list1.val);
        list1=list1.next;
        }
        while(list2!=null){
            L.add(list2.val);
            list2=list2.next;
        }
        Collections.sort(L);
        ListNode result = new ListNode(0);
        ListNode t= result;
        for (int i : L){
            ListNode node = new ListNode(i);
            t.next=node;
            t=t.next;
        }
        return result.next;

    }
}
