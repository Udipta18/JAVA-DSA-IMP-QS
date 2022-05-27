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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> h=new HashSet<>();
        for(int num:nums){
            h.add(num);
        }
        
        int set=0,count=0;
        
        while(head!=null){
            
            if(h.contains(head.val)){
                set=1;
            }
            else if(set==1){
                count++;set=0;
            }
            head=head.next;
        }
        
        return set==1?count+1:count;
    }
}