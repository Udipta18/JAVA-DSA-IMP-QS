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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> li=new ArrayList<>();
        hasMap(root,targetSum,ans,li);
        return li;
    }
    
    
   public void hasMap(TreeNode root,int targetSum,List<Integer> ans,List<List<Integer>> li){

       if(root==null)
           return;
       
       if(root.left==null && root.right==null && targetSum-root.val==0){
           ans.add(root.val);
           li.add(new ArrayList<>(ans));
           ans.remove(ans.size()-1);
       }   
   
       
       ans.add(root.val);
       hasMap(root.left,targetSum-root.val,ans,li);
       hasMap(root.right,targetSum-root.val,ans,li);
       ans.remove(ans.size()-1);
       
   
   }
}

