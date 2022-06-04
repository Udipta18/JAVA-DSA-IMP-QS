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
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root==null)
            return null;
        
        
        if(root.val<key){
              root.right=deleteNode(root.right,key);
        }else if(root.val>key){
            root.left=deleteNode(root.left,key);
        }else {
            if(root.right==null)
                return root.left;
            else if(root.left==null)
                return root.right;
            else {
                  int max=max(root.left);
                   root.left=deleteNode(root.left,max);
                   root.val=max;
            }
        }
        
        return root;
        
             
             
    }
    
    public int max(TreeNode root){
        if(root==null)
            return  Integer.MIN_VALUE;
        
        
        int i=max(root.right);
        return Math.max(root.val,i);
    }
}