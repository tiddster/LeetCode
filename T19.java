/*
给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点
 */
public class T19 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int m = 1;
        ListNode newHead = new ListNode(0,head);
        ListNode node = newHead;
        while(node.next != null){
            m++;
            System.out.println(node.val);
            node = node.next;
        }
        int length = m - n;
        node = newHead;
        while(length > 1){
            length--;
            node = node.next;
        }
        node.next = node.next.next;
        return newHead.next;git
    }
}
