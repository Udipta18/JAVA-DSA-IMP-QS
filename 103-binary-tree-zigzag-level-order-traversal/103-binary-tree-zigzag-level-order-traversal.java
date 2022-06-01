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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (root == null) return ans;
        Queue<TreeNode> que = new LinkedList<>();
        boolean flag = false;
        que.add(root);
        while (!que.isEmpty()) {
            int size = que.size();
            LinkedList<Integer> li = new LinkedList<>();

            while (size-- > 0) {
                root = que.poll();
                li.add(root.val);
                if (root.left != null) que.add(root.left);
                if (root.right != null) que.add(root.right);
            }

            if (flag) Collections.reverse(li);
            ans.add(li);
            flag = !flag;
        }

        return ans;
    }
}
