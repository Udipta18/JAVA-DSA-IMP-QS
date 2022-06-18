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

    public int[] nextLargerNodes(ListNode head) {
        ListNode a = head;
        Stack<Integer> st = new Stack<>();
        List<Integer> li = new ArrayList<>();

        while (a != null) {
            li.add(a.val);
            a = a.next;
        }

        int[] res = new int[li.size()];
        for (int i = 0; i < res.length; i++) {
            while (!st.isEmpty() && li.get(i) > li.get(st.peek())) {
                res[st.pop()] = li.get(i);
            }

            st.push(i);
        }

        return res;
    }
}
