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
    public int pairSum(ListNode head) {
        
        ArrayList<Integer> list=new ArrayList();
        
        while(head!=null){
            list.add(head.val);
            head=head.next;
            
        }
        
        int n=list.size(); int sum=0;
        
        for(int i=0;i<n/2;i++){
            sum=Math.max(sum,list.get(i)+list.get(n-i-1));
        }
        
        return sum;
    }
}