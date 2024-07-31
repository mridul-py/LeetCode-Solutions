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
 import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> L= new ArrayList<>();
        for (int i=0;i<lists.length;i++)
        {
            ListNode temp= lists[i];
            while(temp!=null){
                L.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(L);
        ListNode result = new ListNode(0);
        ListNode t=result;
        for (int i:L){
            ListNode node= new ListNode(i);
            t.next=node;
            t=t.next;
        }
        return result.next;
    }
}
