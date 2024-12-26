package Arrays;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(stocks(prices));
    }
    static int stocks(int[] prices){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice; // selling price - buying price for profit
                maxProfit = Math.max(maxProfit, profit); // max profit gets updated
            }
            // if buying price is greater than the selling price, then instead of selling that stock we will buy it in that price
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit; /* the overall max profit will be returned,
                           if the buying price is highest and there is no chance of profit then the max profit remains zero */
    }
}