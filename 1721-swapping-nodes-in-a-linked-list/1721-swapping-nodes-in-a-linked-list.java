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
    public ListNode swapNodes(ListNode head, int k) {
        k=k-1;
        ListNode a=head;
        while(k>0){
         a=a.next;
            k--;
        }
        
        ListNode temp=a;
        ListNode b=head;
        while(temp.next!=null){
              temp=temp.next;
              b=b.next;
        }
        
        int temp1=a.val;
        a.val=b.val;
        b.val=temp1;
        
         return head;
    }
}
    
   