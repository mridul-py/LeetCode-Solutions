public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> L = new ArrayList<>(); 
        ListNode temp = headA;
        
        while (temp != null) {
            L.add(temp); 
            temp = temp.next;
        }

        ListNode temp1 = headB;

        while (temp1 != null) {
            if (L.contains(temp1)) {
                return temp1;
            }
            temp1 = temp1.next;
        }

        return null;
    }
}
