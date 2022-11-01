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
    public void reorderList(ListNode head) {
        
        if(head==null || head.next==null || head.next.next==null){
              return;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode slowPrev=null;
        while(fast!=null && fast.next!=null){
            slowPrev=slow;
                slow=slow.next;
            fast=fast.next;
            if(fast!=null){
                
                fast=fast.next;
            }
        }
        
        slowPrev.next=null;
        
        
        ListNode second=reverse(slow);
        
        ListNode mergedNode=new ListNode(-1);
        ListNode ans=mergedNode;
        ListNode first=head;
        ListNode sec=second;
        
        while(first!=null && sec!=null){
             ListNode for1=first.next;
             ans.next=first;
            first=for1;
            
            ans=ans.next;
            
            ListNode for2=sec.next;
            ans.next=sec;
            sec=for2;
            
            ans=ans.next;
        }
        
        head=mergedNode.next;
        return;
    }
    
    private ListNode reverse(ListNode slow){
         ListNode prev=null;
        ListNode curr=slow;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        
        return prev;
    }
}