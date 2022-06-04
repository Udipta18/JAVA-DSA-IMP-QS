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
    TreeNode ansl=null;
    TreeNode ansr=null;
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
            return null;
        
        if(val==root.val)
            return root;
        
        if(val>root.val)
            ansl= searchBST(root.right,val);
        if(val<root.val)
           ansr=  searchBST(root.left,val);
        
        return ansl!=null?ansl:ansr;
        
    }
}