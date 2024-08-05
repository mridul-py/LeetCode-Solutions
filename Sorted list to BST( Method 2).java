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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    private TreeNode newTree(List<Integer> nums,int left,int right){
        if(nums.size()==0)
        return null;
        if(left>right)
        return null;
        int mid=left+(right-left)/2;
        TreeNode result=new TreeNode(nums.get(mid));
        result.left= newTree(nums,left,mid-1);
        result.right=newTree(nums,mid+1,right);
        return result;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
        return null;
        List<Integer> L=new ArrayList<>();
        while(head!=null){
            L.add(head.val);
            head=head.next;
        }
        int left=0;
        int right=L.size()-1;
        return newTree(L,left,right);
    }
}
