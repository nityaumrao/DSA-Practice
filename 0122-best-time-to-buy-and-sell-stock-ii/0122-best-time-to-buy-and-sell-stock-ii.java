class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 , buy = prices[0] , sell = prices[0] ;
        int n = prices.length ;
        for(int price : prices){
            if( buy > price ){
                profit += sell-buy;
                buy = price;
                sell = price;
            }
            if(sell<price && sell<=buy){
                sell = price;
                profit += sell - buy ;
                buy = price ;
            }
        } 
        return profit ;
    }
}