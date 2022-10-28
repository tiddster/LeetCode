# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        a = head
        b = head

        for i in range(n):
            if a.next:
                a = a.next
            else:
                return head.next

        while a.next:
            a = a.next
            b = b.next

        b.next = b.next.next
        return head