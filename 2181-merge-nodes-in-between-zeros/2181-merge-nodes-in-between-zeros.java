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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=new ListNode(-1);
        ListNode it=head;
        ListNode  ans=temp;
        
        while(it!=null){
            
            it=it.next;
            int sum=0;
            while(it!=null && it.val!=0){
                 sum+=it.val;
                it=it.next;
            }
            if(sum!=0){
                ans.next=new ListNode(sum);
                ans=ans.next;
            }
        }
        
        return temp.next;
        
    }
}