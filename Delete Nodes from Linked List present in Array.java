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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp=head;
        //List<Integer> L= new ArrayList<>();
        Set<Integer> nums2 = new HashSet<>();
        for (int num : nums) {
            nums2.add(num);
        }
        /*while(temp!=null)
        {
            L.add(temp.val);
            temp=temp.next;
        }*/
        //L.removeAll(nums2);
        ListNode result=new ListNode(0);
        ListNode temp1=result;
        while(temp!=null)
        {
            if(!nums2.contains(temp.val))
            {
                ListNode node= new ListNode(temp.val);
                temp1.next=node;
                temp1=node;
            }
            temp=temp.next;
        }
        return result.next;
    }
}
