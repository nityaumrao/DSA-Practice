class Solution {
    public int INF = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1] ;
        Arrays.fill(dp,INF);
        dp[0] = 0 ;
        return f1(amount , dp , coins);
    }
    private int f1(int amt , int[] dp , int[] coins){
        if(dp[amt] != INF) return dp[amt];

        for(int i = coins.length-1 ; i>=0 ; i--){
            if(amt-coins[i] < 0 ) continue ;
            int res = f1(amt-coins[i] , dp , coins);
            if(res != -1){
                dp[amt] = Math.min(dp[amt] , res+1);
            }
        }
        if(dp[amt] == INF) dp[amt] = -1 ;

        return dp[amt];
    }
}