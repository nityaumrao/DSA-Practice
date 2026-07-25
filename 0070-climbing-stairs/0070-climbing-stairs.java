class Solution {
    public int climbStairs(int n) {
        int [] dp = new int[n+1];
        return f1(n,dp);
    }
    private int f1(int n , int[] dp){
        if(n==0 || n == 1) return 1 ;
        if(dp[n]!= 0) return dp[n];

        dp[n] = f1(n-1, dp) + f1(n-2,dp);
        return dp[n];
    }
}