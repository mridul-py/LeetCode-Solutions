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
    public int pairSum(ListNode head) {
        int Sum=0;
        ListNode temp=head;
        List<Integer> L= new ArrayList<>();
        while(temp!=null)
        {
            L.add(temp.val);
            temp=temp.next;
        }
        int i=0;
        int j=L.size()-1;
        while(i<j)
        {
            int sum= L.get(i)+L.get(j);
            Sum=Math.max(Sum,sum);
            i+=1;
            j-=1;
        }
        return Sum;
    }
}
