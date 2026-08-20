class Solution:
    def fib(self, n: int) -> int:
        dp = [0]*(n+1)
        def f1(dp , n):
            if n<2 :
                return n
            if dp[n] != 0 :
                return dp[n] 
            
            dp[n] = f1(dp,n-1)+f1(dp,n-2)

            return dp[n]

        return f1(dp,n)
