# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        arr = []
        x=head
        while x != None :
            arr.append(x.val)
            x=x.next
        
        mid = (len(arr))//2
        x=head
        idx = 0
        while idx<mid :
            x=x.next
            idx += 1
            
        return x
