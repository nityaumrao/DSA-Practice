# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        l = []
        x = head
        while x != None :
            l.append(x.val)
            x=x.next

        x = head 
        i = 0
        n=len(l)-1
        while x != None :
            x.val = l[n-i]
            i += 1
            x=x.next
        
        return head