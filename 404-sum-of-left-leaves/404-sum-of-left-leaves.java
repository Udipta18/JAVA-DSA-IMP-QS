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
    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        leftSum(root);
        return sum;
    }

    public void leftSum(TreeNode node) {
        if (node == null) {
            return;
        }

        if (isLeafNode(node.left)) {
            sum += node.left.val;
        }

        leftSum(node.left);
        leftSum(node.right);
    }

    public boolean isLeafNode(TreeNode node) {
        if (node == null) {
            return false;
        }

        if (node.left == null && node.right == null) {
            return true;
        }

        return false;
    }
}
