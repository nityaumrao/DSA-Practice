class Solution:
    def countSubstrings(self, s: str) -> int:
        n = len(s)
        if(n<2):
            return n
        def palin(s):
            return s == s[::-1]
        count = 0
        for i in range(n):
            for j in range(i+1,n+1):
                t = s[i:j]
                if palin(t):
                    count+=1
        return count