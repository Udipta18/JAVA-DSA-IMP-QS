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

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftdia = diameterOfBinaryTree(root.left);
        int rightdia = diameterOfBinaryTree(root.right);
        int root1 = max(root.left) + max(root.right) + 2;

        return Math.max(root1, Math.max(leftdia, rightdia));
    }

    public int max(TreeNode node) {
        if (node == null) {
            return -1;
        }

        int ld = max(node.left);
        int rd = max(node.right);

        return Math.max(ld, rd) + 1;
    }
}
