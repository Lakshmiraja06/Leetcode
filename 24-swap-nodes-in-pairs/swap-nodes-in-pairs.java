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
    public ListNode swapPairs(ListNode head) {
        // if(head==null || head.next==null){
        //     return head;
        // }
        // ListNode temp=head;
        // while(temp!=null && temp.next!=null){
        //     int swap=temp.val;
        //     temp.val=temp.next.val;
        //     temp.next.val=swap;
        //     temp=temp.next.next;
        // }
        // //temp=temp.next.next;
        // return head;

        if(head==null || head.next==null){
            return head;
        }
        ListNode prev = null;
        ListNode newhead=head.next;
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            ListNode temp1=temp.next;
            ListNode nextnode = temp1.next;
            temp1.next=temp;
            temp.next=nextnode;
            if(prev!=null){
                prev.next=temp1;
            }
            prev=temp;
            temp=nextnode;
        }
        return newhead;
    }
   
}