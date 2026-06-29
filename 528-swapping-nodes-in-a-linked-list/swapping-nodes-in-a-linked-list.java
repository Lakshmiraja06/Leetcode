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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int first=0;
        ListNode t1=head;
        for(int i=1;i<=k;i++){
            first=t1.val;
            t1=t1.next;
        }
        int second=0;
        ListNode t2=head;
        int len = (count-k)+1;
        for(int i=1;i<=len;i++){
            second=t2.val;
            t2=t2.next;
        }
        ListNode nn=head;
        for(int i=1;i<=count;i++){
            if(i==k){
                nn.val=second;
            }
            if(i==len){
                nn.val=first;
            }
            nn=nn.next;
        }
        return head;
    }
}