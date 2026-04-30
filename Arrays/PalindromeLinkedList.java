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
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        if(head.next==null){
            return true;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode prevSlow=null;
        
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            prevSlow=slow;
            slow=slow.next;
        }

        prevSlow.next=null;
        ListNode prev=null, curr=slow,next;
        
        while(slow!=null){
            next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;    
        }

        while(head!=null){
            if(head.val!=prev.val){
                return false;
            }

            head=head.next;
            prev=prev.next;
        }

        return true;
    }
}