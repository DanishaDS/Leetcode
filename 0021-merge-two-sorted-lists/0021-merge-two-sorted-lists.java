
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=new ListNode(-1);
        ListNode temp=head;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<temp2.val)
            {
                ListNode nn=new ListNode(temp1.val);
                temp.next=nn;
                temp = nn;
                temp1=temp1.next;
                
            }
            else 
            {
                 ListNode nn=new ListNode(temp2.val);
                 temp.next=nn;
                 temp = nn;
                 temp2=temp2.next;
            }
        }
        if(temp2!=null)
        {
           temp.next = temp2;
        }
        else if(temp1!=null && temp2==null)
        {
            temp.next = temp1;
        }
         return head.next;
    }
}