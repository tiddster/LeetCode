public class T83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode r=head;
        ListNode p=head.next;
        while (p!=null){
            if(r.val==p.val){
                r.next=p.next;
            }else {
                r=p;
            }
            p=p.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
