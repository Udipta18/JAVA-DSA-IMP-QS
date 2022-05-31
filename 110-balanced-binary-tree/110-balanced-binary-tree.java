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
public class BalancePair{
   boolean bal=true;
    int ht=-1;
}
class Solution {
    public boolean isBalanced(TreeNode root) {
      BalancePair ans=  isBalancePair(root);
        return ans.bal;
    }
    
    public BalancePair isBalancePair(TreeNode root){
        
        if(root==null)
            return new BalancePair();
        
        
        
        BalancePair lp=isBalancePair(root.left);
        BalancePair rp=isBalancePair(root.right);
        
        BalancePair bp=new BalancePair();
        
        bp.ht=Math.max(lp.ht,rp.ht)+1;
        int bf=Math.abs(lp.ht-rp.ht);
        
        bp.bal=lp.bal && rp.bal && bf<=1;
        
        return bp;
        
        
        
    }
}