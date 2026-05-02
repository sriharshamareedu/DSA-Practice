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
    public ListNode partition(ListNode head, int x) {
        if(head==null){
            return head;
        }

        ListNode first=new ListNode(0);
        ListNode firstRef=first;
        ListNode second=new ListNode(0);
        ListNode secondRef=second;

        ListNode l=head;
        while(l!=null){
            int a=l.val;
            ListNode n=new ListNode(a);

            if(a<x){
                first.next=n;
                first=first.next;
            }
            else{
                second.next=n;
                second=second.next;
            }

            l=l.next;
        }

        firstRef=firstRef.next;
        secondRef=secondRef.next;

        if(firstRef==null){
            return secondRef;
        }

        if(secondRef==null){
            return firstRef;
        }

        first.next=secondRef;

        return firstRef;

    }
}