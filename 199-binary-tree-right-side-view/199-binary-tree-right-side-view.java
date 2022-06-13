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
    int max_depth = -1;

    public List<Integer> rightSideView(TreeNode root) {
        LinkedList<Integer> ll = new LinkedList<>();
        view(root, ll, 0);
        return ll;
    }

    public void view(TreeNode root, LinkedList<Integer> ll, int cur_level) {
        if (root == null) {
            return;
        }

        if (cur_level > max_depth) {
            ll.add(root.val);
            max_depth = cur_level;
        }

        view(root.right, ll, cur_level + 1);
        view(root.left, ll, cur_level + 1);
    }
}
