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
    public ArrayList<Integer> L= new ArrayList<>();
        public void inorder(TreeNode root){
                if(root==null){
            return;
        }
        inorder(root.left);
        L.add(root.val);
        inorder(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < L.size(); i++) {
            minDiff = Math.min(minDiff, L.get(i) - L.get(i - 1));
        }
        return minDiff;
    }
}
