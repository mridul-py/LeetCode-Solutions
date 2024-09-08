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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        int Size =0;
        while(temp!=null)
        {
            Size++;
            temp=temp.next;
        }
        temp=head;
        ListNode L[]=new ListNode[k];
        int i=0;
        int a=0;
        int b=0;
        if(Size<=k)
        {
            while(temp!=null){
                ListNode node = new ListNode(temp.val);
                L[i]=node;
                temp=temp.next;
                i++;
            }
        }
        else
        {
            temp=head;
            a=Size%k;
            int partSize = Size / k;
            b=1;
            int c=0;
            ListNode current=head;
            
            int j=0;     
            while (j < L.length) {
                ListNode prev = new ListNode(0);
                ListNode t = prev;
                int count = 0;

                int currentPartSize = partSize + (j < a ? 1 : 0);// Did ChatGpt for this line
                while (count < currentPartSize) {
                    ListNode N = new ListNode(current.val);
                    t.next = N;
                     t = N;
                    current = current.next;
                    count++;
                    }

                   L[j] = prev.next;
                   j++;
                }
        }
        return L;
    }
}
