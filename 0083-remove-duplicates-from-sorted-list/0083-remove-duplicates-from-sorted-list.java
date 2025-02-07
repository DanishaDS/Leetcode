class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode a=new ListNode(-101);
        a.next=head;
        ListNode temp=head;
        ListNode prev=a;
        if (head==null)
        return head;
        while(temp.next!=null)
        {
            if(prev.val==temp.val)
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
        if(prev.val==temp.val)
        prev.next=null;
        return a.next;
    }
}