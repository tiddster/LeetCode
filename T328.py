# Definition for singly-linked list.
class ListNode(object):
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next


class Solution(object):
    def oddEvenList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head == None or head.next == None:
            return head

        J = head
        O = head.next
        Otmp = O
        while J.next and O.next:
            J.next = O.next
            J = J.next
            O.next = J.next
            O = O.next

        J.next = Otmp
        return head