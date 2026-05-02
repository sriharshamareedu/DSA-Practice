class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }

        int length=1;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }

        int rotateSteps=k%length;
        if(rotateSteps==0){
            return head;
        }

        int stepsToNewHead=length-rotateSteps;
        ListNode prev=null;
        ListNode curr=head;
        for (int i=0;i<stepsToNewHead;i++){
            prev=curr;
            curr=curr.next;
        }

        prev.next=null;
        tail.next=head;   
        head=curr;

        return head;        
    }
}