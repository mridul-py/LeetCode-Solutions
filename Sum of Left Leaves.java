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
    int Sum=0;
    private void SumLeft(TreeNode root){
        if (root == null) {
            return; 
        }
        if (root.left != null && root.left.left == null && root.left.right == null) 
        {
            Sum+=root.left.val;
        }
        SumLeft(root.left);
        SumLeft(root.right);

    }
    public int sumOfLeftLeaves(TreeNode root) {
        SumLeft(root);
        return Sum;
    }
}
