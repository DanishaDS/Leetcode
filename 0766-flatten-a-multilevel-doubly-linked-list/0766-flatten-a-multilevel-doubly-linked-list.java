class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;
        
        Node temp = head;
        
        while (temp != null) {  
            if (temp.child != null) {
                Node temp1 = temp.child;
                
                while (temp1.next != null) {
                    temp1 = temp1.next;
                }
                
                temp1.next = temp.next;
                
                if (temp.next != null) {
                    temp.next.prev = temp1;
                }
                
                temp.next = temp.child;
                temp.child.prev = temp;
                temp.child = null;  
            }
            temp = temp.next;  
        }
        
        return head;
    }
}
