/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1=headA;

        int m=0;

        while(l1!=null){
            m++;
            l1=l1.next;
        }

        ListNode l2=headB;

        int n=0;

        while(l2!=null){
            n++;
            l2=l2.next;
        }

        int a=Math.abs(m-n);

        l1=headA;
        l2=headB;

        if(m>n){
            for(int i=0;i<a;i++){
                l1=l1.next;
            }
        }
        else{
            for(int i=0;i<a;i++){
                l2=l2.next;
            }
        }

        while(l1!=null){
            if(l1==l2){
                return l1;
            }

            l1=l1.next;
            l2=l2.next;
        }

        return null;
    }
}