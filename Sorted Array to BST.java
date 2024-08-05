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
    private TreeNode newTree(int[] nums,int left,int right)
    {
        if (nums==null||nums.length==0)
        return null;
        if(left>right)
        return null;
        int mid=left+(right -left)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=newTree(nums,left,mid-1);
        node.right=newTree(nums,mid+1,right);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int left=0;
        int right=nums.length-1;
        return newTree(nums,left,right);
    }
}
