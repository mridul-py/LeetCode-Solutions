# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
import sys
sys.set_int_max_str_digits(0)
class Solution:
    def doubleIt(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr=head
        k=""
        Size=0
        while(curr):
            k+=str(curr.val)
            Size+=1
            curr=curr.next
        n=int(k)
        a=n*2
        b=str(a)
        temp=head
        i=0
        while(temp):
            temp.val=int(b[i])
            i+=1
            temp=temp.next
        if(Size!=len(b)):
            curr=head
            while(curr.next):
                curr=curr.next
            curr.next=ListNode(int(b[len(b)-1]))
        return head
