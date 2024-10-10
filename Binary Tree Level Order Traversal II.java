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
    private List<List<Integer>> BFS(TreeNode root)
    { 
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.right != null) queue.offer(node.right);
                if (node.left != null) queue.offer(node.left);
                
            }
            
            result.add(level);
        }
        for (List<Integer> L: result)
        Collections.reverse(L);
        Collections.reverse(result);
        return result;
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        return BFS(root);
    }
}
