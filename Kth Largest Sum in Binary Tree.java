import java.util.*;

class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null) return -1;
        Queue<TreeNode> queue = new LinkedList<>();
        PriorityQueue<Long> P = new PriorityQueue<>();
        queue.offer(root);
        int levelCount = 0;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            long levelSum = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                levelSum += current.val;
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
            P.add(levelSum);
            levelCount++;
            if (P.size() > k) {
                P.poll();
            }
        }
        if (levelCount < k) {
            return -1;
        }
        return P.isEmpty() ? -1 : P.poll();
    }
}
