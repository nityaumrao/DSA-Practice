class Solution:
    def isPalindrome(self, s: str) -> bool:
        s1 = ''.join([x for x in s if x.isalnum()]).lower()
        return s1==s1[::-1]

        