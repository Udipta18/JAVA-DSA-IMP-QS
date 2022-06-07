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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root=construct(nums,0,nums.length-1);
        return root;
    }
    
    public TreeNode construct(int[] nums,int s,int e){
        if(s>e) return null;
        if(s==e) return new TreeNode(nums[s]);
        
        
        int idx=max(nums,s,e);
        TreeNode root =new TreeNode(nums[idx]);
        root.left=construct(nums,s,idx-1);
        root.right=construct(nums,idx+1,e);
        
        return root;
    }
    
    public int max(int[] nums,int s,int e){
        int max=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=s;i<=e;i++){
           if(nums[i]>max){
               max=nums[i];
               idx=i;
           }
        }
        
        return idx;
    }
}