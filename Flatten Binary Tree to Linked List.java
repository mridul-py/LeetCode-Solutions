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
    public void PreOrder(TreeNode parent, List<Integer> L)
    {
        if(parent==null)
        return;
        L.add(parent.val);
        PreOrder(parent.left,L);
        PreOrder(parent.right,L);
    }
    public void flatten(TreeNode root) {
        TreeNode parent=root;
        List<Integer> L= new ArrayList<>();
        PreOrder(parent,L);
        TreeNode temp=root;
        int i=L.size();
        for(int j=1;j<i;j++)
        {
            temp.left=null;
            temp.right=new TreeNode(L.get(j));
            temp=temp.right;
        }
    }
}
