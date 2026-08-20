# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        l1 = list1
        l2 = list2
        head = ListNode(0)
        x = head

        while( l1 != None and l2 != None ):
            if l1.val < l2.val :
                temp = ListNode(l1.val)
                x.next = temp
                l1=l1.next
            else :
                temp = ListNode(l2.val)
                x.next = temp
                l2=l2.next
            x=x.next
        
        while(l1 != None):
            temp = ListNode(l1.val)
            x.next = temp
            x = x.next
            l1=l1.next
            
        while(l2 != None):
            temp = ListNode(l2.val)
            x.next = temp
            x = x.next
            l2=l2.next

        return head.next 
                

        