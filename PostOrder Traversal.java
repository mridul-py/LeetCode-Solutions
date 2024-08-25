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
    private List<Integer> PostOrder(TreeNode root, List<Integer> L)
    {
        if(root!=null){
        PostOrder(root.left,L);
        PostOrder(root.right,L);
        L.add(root.val);
        }
        return L;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> L= new ArrayList<>();

        return PostOrder(root,L);
    }
}
