class Solution {
    private TreeNode Search(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (val < root.val) {
            return Search(root.left, val);
        } else {
            return Search(root.right, val);
        }
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return Search(root, val);
    }
}
