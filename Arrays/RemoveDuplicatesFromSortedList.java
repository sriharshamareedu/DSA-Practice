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
class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        int prev=-101;
        ListNode l=head;
        ListNode ref=head;

        while(l!=null){
            prev=l.val;
            
            if(l.val==prev){
                while(ref!=null&&ref.val==prev){
                    ref=ref.next;
                }

                l.next=ref;
            }
            else{
                ref=ref.next;
            }

            l=l.next;
        }

        return head;
    }
}