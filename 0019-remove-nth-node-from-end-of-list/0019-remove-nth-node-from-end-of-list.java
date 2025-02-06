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
        ListNode temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }

        if (n == c) {
            return head.next;
        }

        temp = head;
        ListNode prev = null;
        for (int i = 0; i < c - n; i++) {
            prev = temp;
            temp = temp.next;
        }

        if (prev != null) {
            prev.next = temp.next;
        }

        return head;
    }
}
