class Solution {
    public ListNode reverseList(ListNode head){
        // ListNode temp=head;
        // ListNode prev=null;
        // ListNode next=null;
        // while(temp!=null){
        //     next=temp.next;
        //     temp.next=prev;
        //     prev=temp;
        //     temp=next;
        // }
        // head=prev;
        // return head;

        if(head==null || head.next==null){
                return head;
            }
            ListNode newhead = reverseList(head.next);
            head.next.next=head;
            head.next=null;
            return newhead;
    }
}
   