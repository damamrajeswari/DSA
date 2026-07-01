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
    public ListNode doubleIt(ListNode head) {
        ListNode curr=head;
        while(curr!=null){
            curr.val=curr.val*2;
            curr=curr.next;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode res=dummy;
        while(dummy.next!=null){
            if(dummy.next.val>9){
                dummy.val=dummy.val+dummy.next.val/10;
                dummy.next.val=dummy.next.val%10;
            }
            dummy=dummy.next;
        }
        if(res.val==0){
            res=res.next;
        }
        return res;
    }
}