class Solution {
    public int maxProfit(int[] prices)
    {
        int cheapest = Integer.MAX_VALUE;
        int profit = 0;
        
        for(int price : prices)
            {
                if((price - cheapest) > profit)
                    {
                        profit = (price - cheapest);
                    }

                if(price < cheapest)
                    {
                        cheapest = price;
                    }
            }
            return profit;
    }
}
