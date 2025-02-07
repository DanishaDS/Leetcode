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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>H=new HashSet<>();
        int n=nums.length;
        ListNode temp=head;
        ListNode a=new ListNode(0);
        a.next=head;
        ListNode prev=a;
        if(head==null)
        return head;
        for(int i=0;i<n;i++)
        {
            H.add(nums[i]);
        }
        while(temp.next!=null)
        {
            if(H.contains(temp.val))
            {
              prev.next=temp.next;
              temp=temp.next;
            }
            else
            {
                prev=temp;
                temp=temp.next;
            }
        }
        if(H.contains(temp.val))
        {
            prev.next=null;
            
        }
        return a.next;
    }
}