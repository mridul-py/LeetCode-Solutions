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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode Size=list1;
        int s=0;
        while(Size!=null)
        {
            s++;
            Size=Size.next;
        }
        if(a==b)
        {
            ListNode t=list1;
            ListNode p=list2;
            int d=0;
            int e=0;
            ListNode part3 = null;
            ListNode temp2=list1;
            while(temp2!=null)
            {
                if(e==b)
                {
                    part3=temp2.next;
                    break;
                }
                e++;
                temp2=temp2.next;
            }
            while(t.next!=null)
            {
                if(d+1==a)
                {
                    t.next=list2;
                }
               d++;
               t=t.next;
            }
            t.next=part3;
            return list1;
        }
        ListNode result= new ListNode(0);
        ListNode head2=result;
        int Count=0;
        int UpperSize=0;
        ListNode head=list2;
        ListNode temp1=list1;
        ListNode Part2=null;
        while(temp1!=null)
        {
            if(UpperSize==b)
            {
                Part2=temp1.next;
                break;
            }
            UpperSize++;
            temp1=temp1.next;
        }
        while(temp!=null)
        {
            ListNode node=new ListNode(temp.val);
            head2.next=node;
            head2=node;
            Count++;
            if(Count==s)
            break;
            if(Count==a && Count < b)
            {
                while(head!=null)
                {
                    ListNode m= new ListNode(head.val);
                    head2.next=m;
                    head2=m;
                    Count++;
                    head=head.next;
                }
                head2.next=Part2;
                break;
            }
            temp=temp.next;
        }
        return result.next;
    }
}
