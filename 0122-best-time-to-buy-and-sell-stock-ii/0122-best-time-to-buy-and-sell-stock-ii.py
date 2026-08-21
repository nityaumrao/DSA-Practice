class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        buy = prices[0]
        sell = prices[0]
        profit = sell - buy
        maxi = 0

        for i in prices :
            if i < buy or sell > i :
                buy = i
                sell = i
                
            if sell<i :
                sell = i
                profit = sell-buy
                maxi += profit
                buy = i 
            
        return maxi
