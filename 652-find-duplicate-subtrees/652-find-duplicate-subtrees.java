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
    Map<String, Integer> map = new HashMap();
    List<TreeNode> li = new ArrayList();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        find(root);
        return li;
    }

    public String find(TreeNode root) {
        if (root == null) return "X";

        String left = find(root.left);
        String right = find(root.right);
        String ans = Integer.toString(root.val) + " " + left + " " + right;

        map.put(ans, map.getOrDefault(ans, 0) + 1);
        if (map.get(ans) == 2) li.add(root);

        return ans;
    }
}
