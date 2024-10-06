package Arrays;

public class StockBuySell
{
    public static int BuyAndSellStock(int prices[])
    {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i=0; i<prices.length; i++)
        {
            if (buyPrice<prices[i])
            {
                int profit=prices[i]-buyPrice;// profit
                maxProfit=Math.max(maxProfit,profit);//Today Profit
            }
            else {
                buyPrice=prices[i];
            }

        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]=ArrayInput.intput();
        System.out.println( BuyAndSellStock(prices));
    }
}
