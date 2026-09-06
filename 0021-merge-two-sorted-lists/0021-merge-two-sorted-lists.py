# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        l=ListNode(0)
        x = l
        i=list1
        j=list2
        while i !=None and j !=None :
            if i.val<j.val:
                x.next=ListNode(i.val)
                i=i.next 
            else:
                x.next=ListNode(j.val)
                j=j.next
            x=x.next
        while i != None :
            x.next=ListNode(i.val)
            i=i.next
            x=x.next
        while j != None :
            x.next=ListNode(j.val)
            j=j.next
            x=x.next
        
        return l.next     

               
           

        