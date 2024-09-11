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
    private int GCD(int a,int b)
    {
        int result=Math.min(a,b);
        while(result>=0)
        {
            if(a%result==0 && b%result==0)
            break;
            result--;
        }
        return result;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        int CountAdjacent=0;
        ListNode temp=head;
        //ListNode p=head;
        ListNode result=new ListNode(0);
        ListNode current=result;
        List<Integer> L= new ArrayList<>();
        //List<Integer> L1= new ArrayList<>();
        //while(p!=null)
        //{
           // L1.add(p.val);
           // p=p.next;
      //  }
       while (temp.next != null) {
          int a = temp.val;          
           int b = temp.next.val;     
          int c = GCD(a, b);        

          L.add(a);                 
         L.add(c);                  
          temp = temp.next;          
           }
         L.add(temp.val); 

        for(int x: L)
        {
            ListNode node = new ListNode(x);
            current.next=node;
            current=node;
        }
        return result.next;
    }
}
