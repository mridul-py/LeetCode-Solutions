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
    public void reorderList(ListNode head) {
        List<Integer> L= new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            L.add(temp.val);
            temp=temp.next;
        }
        int i=L.size()-1;
        ListNode temp1=head;
        Boolean shit=true;
        int j=0;
        while(temp1!=null)
        {
            if(shit)
            {
            shit=false;
            temp1.val=L.get(j);
            j++;
            }
            else
            {
            temp1.val=L.get(i);
            i--;
            shit=true;
            }
            
            temp1=temp1.next;
        }
    }
}
