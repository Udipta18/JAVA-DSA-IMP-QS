/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
            return null;
        return helper(head,null);
    }
    
    public TreeNode helper(ListNode head,ListNode last){
        ListNode fast=head;
        ListNode slow=head;
        
        if(head == last){
            return null;
        }
        
        while(fast!=last && fast.next!=last){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        TreeNode node=new TreeNode(slow.val);
        node.left=helper(head,slow);
        node.right=helper(slow.next,last);
        
        return node;
    }
}