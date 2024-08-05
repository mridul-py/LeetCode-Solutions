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
    private int depthFinder(TreeNode root){
        if(root==null)
        return 0;
        int left=depthFinder(root.left);
        int right=depthFinder(root.right);
        return Math.max(left,right)+1;
    }
    public int maxDepth(TreeNode root) {
        return depthFinder(root);
    }
}
