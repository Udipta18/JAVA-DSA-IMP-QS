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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        int count=0;
        ListNode temp=head;
        
        while(temp!=null){
           temp=temp.next;
            count++;
            
        }
        
         if(count==n){
           return head.next;
        }
        
        int len=count-n-1;
       
        
        temp=head;
        
        
        while(temp.next!=null && len!=0){
            temp=temp.next;
            len--;
        }
        
        if(temp.next!=null)
        temp.next=temp.next.next;
        
        return head;
        
        
        
    }
}