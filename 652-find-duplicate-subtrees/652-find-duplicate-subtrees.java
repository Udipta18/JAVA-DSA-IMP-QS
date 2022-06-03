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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Integer> set = new HashMap<>();
        List<TreeNode> res = new ArrayList<>();
        helper(root, res, set);
        return res;
    }
    public String helper(TreeNode root, List<TreeNode> res, Map<String, Integer> map) {
        if (root == null) return "";
        String s = "(" + helper(root.left, res, map) + root.val + helper(root.right, res, map) + ")";
        if (map.getOrDefault(s, 0) == 1) res.add(root);
        map.put(s, map.getOrDefault(s, 0) + 1);
        return s;
    }
}
