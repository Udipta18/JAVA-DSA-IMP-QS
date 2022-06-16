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
    List<Integer> list = new ArrayList<>();

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        getElements(root1);
        getElements(root2);
        Collections.sort(list);
        return list;
    }

    public List<Integer> getElements(TreeNode root) {
        if (root == null) return null;
        getElements(root.left);
        list.add(root.val);
        getElements(root.right);
        return list;
    }
}
