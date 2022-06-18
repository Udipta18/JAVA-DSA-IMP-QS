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

    public int widthOfBinaryTree(TreeNode root) {
        int max = 0;
        Map<TreeNode, Integer> map = new HashMap<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        map.put(root, 0);
        while (!qu.isEmpty()) {
            int size = qu.size();
            int left = map.get(qu.peek());
            while (size-- > 0) {
                TreeNode node = qu.poll();
                max = Math.max(max, map.get(node) - left + 1);

                if (node.left != null) {
                    qu.offer(node.left);
                    map.put(node.left, 2 * map.get(node));
                }
                if (node.right != null) {
                    qu.offer(node.right);
                    map.put(node.right, 2 * map.get(node) + 1);
                }
            }
        }

        return max;
    }
}
