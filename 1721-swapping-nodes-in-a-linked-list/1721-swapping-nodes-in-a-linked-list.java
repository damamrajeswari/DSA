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
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int temp1=list.get(k-1);
        int temp2=list.get(list.size()-k);
        ListNode dummy=new ListNode(0);
        ListNode start=dummy;
        for(int i=0;i<list.size();i++){
            if(i+1==k){
                dummy.next=new ListNode(temp2);
            }else if(i+1==list.size()-k+1){
                dummy.next=new ListNode(temp1);
            }else{
                dummy.next=new ListNode(list.get(i));
            }
            dummy=dummy.next;
        }
        return start.next;
    }
}