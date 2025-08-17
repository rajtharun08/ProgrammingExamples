public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices)
    {
        int profit=0;
        int n=prices.length;
        for(int i=0;i<n-1;i++)
        {
            int currprofit=prices[i+1]-prices[i];
            if(currprofit>0)
            {
                profit+=currprofit;
            }
        }
        return profit;
    }
}
