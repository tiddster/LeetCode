public class T237 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public void deleteNode(ListNode node) {
        ListNode newNode = node.next;
        node.val = newNode.val;
        node.next = newNode.next;
    }
}
