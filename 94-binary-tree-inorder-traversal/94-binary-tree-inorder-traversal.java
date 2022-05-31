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
    List<Integer> li=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
       Traverse(root);
       return li; 
    }
    
   public void Traverse(TreeNode root){
if(root==null)
            return;
        
        Traverse(root.left);
        li.add(root.val);
        Traverse(root.right);
   }
}