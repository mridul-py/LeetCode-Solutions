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
    public List<Integer> List2(List<Integer> L, int k){
        List<Integer> A = new ArrayList<>();
        int n = L.size();
        k = k % n; // in case k is greater than the size of the list
        
        // Shift the list to the right by k places
        for (int i = 0; i < n; i++) {
            A.add(L.get((n - k + i) % n));
        }
        return A;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        List<Integer> L = new ArrayList<>();
        ListNode current = head;
        
        // Convert linked list to array list
        while (current != null) {
            L.add(current.val);
            current = current.next;
        }

        // Rotate the list using the List2 function
        List<Integer> rotatedList = List2(L, k);

        // Convert the rotated array list back to a linked list
        ListNode result = new ListNode(0); // Dummy node
        ListNode temp = result;
        for (int val : rotatedList) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        return result.next;
    }
}
