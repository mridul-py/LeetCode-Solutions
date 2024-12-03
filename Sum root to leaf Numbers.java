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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        findPaths(root, "", paths);
        return paths;
    }
    private void findPaths(TreeNode node, String path, List<String> paths) {
        if (node == null) {
            return; 
        }
        path += node.val;
        if (node.left == null && node.right == null) {
            paths.add(path);
        } else {
            findPaths(node.left, path, paths);
            findPaths(node.right, path, paths);
        }
    }
    public int sumNumbers(TreeNode root) {
        List<String> L=binaryTreePaths(root);
        int Sum=0;
        for (String i:L){
            Sum+=Integer.parseInt(i);
        }
        return Sum;
    }
}
