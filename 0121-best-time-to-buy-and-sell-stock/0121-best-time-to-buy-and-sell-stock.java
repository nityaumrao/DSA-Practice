class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 , buy = prices[0];
        int n = prices.length ;
        for(int price : prices){
            if( buy > price ){
                buy = price;
            }else{
                profit = Math.max(profit , price-buy);
            }
        } 
        return profit ;
    }
}