/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
private static void findPathsRecursive(TreeNode node, List<Integer> currentPath, List<List<Integer>>  result) {
        if (node == null) {
            return;
        }
        currentPath.add(node.val);
        if (node.left == null && node.right == null) {
            result.add(new ArrayList<>(currentPath));
        } else {
            findPathsRecursive(node.left, currentPath, result);
            findPathsRecursive(node.right, currentPath, result);
        }
        currentPath.remove(currentPath.size() - 1);
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
        List<Integer> currentPath = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(head==null)
        return true;
        if (root==null)
        return false;
        findPathsRecursive(root, currentPath, result);
        ListNode temp=head;
        List<Integer> c = new ArrayList<>();
        while(temp!=null)
        {
            c.add(temp.val);
            temp=temp.next;
        }
        for (List<Integer> path : result) {
            if (Collections.indexOfSubList(path, c) != -1) {
                return true;
            }
        }
        return false;
    }
}
