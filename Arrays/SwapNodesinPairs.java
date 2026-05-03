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
        if(head==null||head.next==null){
            return head;
        }

        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        ListNode first=head;
        ListNode second=head.next;


        while(true){
            first.next=second.next;
            second.next=first;
            prev.next=second;

            if(first.next==null||first.next.next==null){
                break;
            }

            prev=first;
            second=first.next.next;
            first=first.next;
        }

        return dummy.next;
    }
}