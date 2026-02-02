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
    public int pairSum(ListNode head) {
        //ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
    
        ListNode temp=slow;
        ListNode prev=null;
        ListNode next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        ListNode temp1=head;
        ListNode temp2=prev;
        int max=0;
        while(temp2!=null){
            int a = temp1.val+temp2.val;
            if(max<a)
            {
                max = a;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return max;
    }
    //return temp3;
}
