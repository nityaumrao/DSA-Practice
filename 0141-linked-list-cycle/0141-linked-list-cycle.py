# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        d = {}
        x=head
        if x == None :
            return False
        while x!=None:
            d[x]=d.get(x,0)+1
            if d[x] == 2 :
                return True 
            x=x.next
        return False