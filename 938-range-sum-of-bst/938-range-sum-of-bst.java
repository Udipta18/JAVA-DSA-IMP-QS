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
    private int ans = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        dfs(root , low , high);
        return ans;
    }
    
    private void dfs(TreeNode node , int L , int H){
        if(node != null){
            if( L <= node.val && node.val <= H)
                ans += node.val;
            if(L < node.val)
                dfs(node.left , L , H);
            if(node.val < H)
                dfs(node.right , L , H);
        }
    }
}