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
    private void preorder(TreeNode root,List<Integer> L)
    {
        if(root==null)
        return;
        L.add(root.val);
        preorder(root.left,L);
        preorder(root.right,L);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> L= new ArrayList<>();
        preorder(root,L);
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        int Count=0;
        for(int i:L)
        {
            p.add(i);
            Count++;
            if(Count>k)
            p.poll();
        }
        return p.poll();
    }
}
