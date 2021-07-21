public class T2032 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

    }

    public static class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode pA,pB;
            if(headA == null || headB == null){
                return null;
            } else {
                pA = headA;
                pB = headB;
            }
            while(pA != pB){
                pA = pA == null ? headA : pA.next;
                pB = pB == null ? headB : pB.next;
            }
            return pA;
        }
    }
}
