class Solution {
    private int postIndex;

    private int search(int[] inorder, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == value)
                return i;
        }
        return -1;
    }

    private TreeNode buildTree(int[] inorder, int[] postorder, int start, int end) {
        if (start > end)
            return null;

        TreeNode root = new TreeNode(postorder[postIndex--]);

        if (start == end)
            return root;

        int inorderIndex = search(inorder, start, end, root.val);

        root.right = buildTree(inorder, postorder, inorderIndex + 1, end);
        root.left = buildTree(inorder, postorder, start, inorderIndex - 1);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        return buildTree(inorder, postorder, 0, inorder.length - 1);
    }
}
