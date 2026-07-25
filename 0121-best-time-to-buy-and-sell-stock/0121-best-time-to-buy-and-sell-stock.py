class Solution(object):
    def maxProfit(self, prices):
        buy = prices[0]
        profit = 0

        for price in prices:
            buy = min(buy, price)
            profit = max(profit, price - buy)

        return profit