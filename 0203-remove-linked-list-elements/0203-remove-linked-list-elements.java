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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        ListNode a=new ListNode (-1);
        a.next=head;
        ListNode prev=a;
        if(head==null)
        return head;
        while(temp.next!=null)
        {
            if(temp.val==val)
            {
                prev.next=temp.next;
                temp=prev.next;
            }
            else
            {
                prev=temp;
                 temp=temp.next;
            }
          
        }
        if(temp.val==val)
        {
         prev.next=null;
                   
        }
        return a.next;
    }
}