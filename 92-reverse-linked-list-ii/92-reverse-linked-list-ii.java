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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode itleft = dummy;
        ListNode prevleft = null;

        for (int i = 0; i < left; i++) {
            prevleft = itleft;
            itleft = itleft.next;
        }

        ListNode itr = itleft;
        ListNode prevr = prevleft;

        for (int i = left; i <= right; i++) {
            ListNode forward = itr.next;
            itr.next = prevr;
            prevr = itr;
            itr = forward;
        }

        itleft.next = itr;
        prevleft.next = prevr;
        
        return dummy.next;
    }
}
