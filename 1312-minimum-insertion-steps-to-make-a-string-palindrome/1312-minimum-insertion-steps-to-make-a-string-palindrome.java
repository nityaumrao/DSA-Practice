class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i = 0 ; i<n ; i++ ){
            Arrays.fill(dp[i],-1);
        }
        return f1(s, 0 , s.length()-1 , dp);
    }
    private int f1(String s , int l , int r , int[][] dp){
        if(l>=r) return 0;
        
        if(dp[l][r] != -1) return dp[l][r];

        if(s.charAt(r)==s.charAt(l)){
            return dp[l][r] = f1(s,l+1,r-1,dp);
        }
        int cLeft = 1+ f1(s,l+1 ,r,dp);
        int cRight = 1+ f1(s,l,r-1,dp);
         
        return dp[l][r] = Math.min(cLeft,cRight);
    }
}