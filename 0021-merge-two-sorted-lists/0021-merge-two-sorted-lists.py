# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        l=ListNode(0)
        i=list1
        j=list2
        x=l
        while i!=None and j!=None:
            if i.val<j.val:
                x.next=i
                i=i.next
            else:
                x.next=j
                j=j.next
            x=x.next
        while i:
            x.next=i
            i=i.next
            x=x.next
        while j:
            x.next=j
            j=j.next
            x=x.next
        return l.next        


            
        