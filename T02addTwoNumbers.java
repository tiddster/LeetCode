/*
给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。

请你将两个数相加，并以相同形式返回一个表示和的链表。

你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class T02addTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0),pRes,head;
        head = res;
        int sum = 0;
        while (l1 != null || l2 != null||sum != 0){
            int val1 = 0, val2 = 0;
            if(l1 != null) {val1 = l1.val; l1 = l1.next;}
            if(l2 != null) {val2 = l2.val; l2 = l2.next;}
            sum = val1 + val2 + sum;

            pRes = new ListNode(sum%10);
            res.next = pRes;
            res = pRes;

            sum /= 10;
        }
        return head.next;
    }
}
