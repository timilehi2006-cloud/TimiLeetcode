class Solution {
    public int maxProfit(int[] prices) 
    {
        // to ensure that the minNum is initialised to the first element in the array 
      int minNum = Integer.MAX_VALUE;
      int maxProfit = 0;
        
      for ( int i = 0; i < prices.length; i++ )
      {
        // used to assign minNum only if a smaller day to buy is buy is seen 
        if ( prices[i] < minNum )
        {
            minNum = prices[i];
        }
        else 
        {
            // provides the max profit between the initial maxprofit and newst days profit 
            maxProfit = Math.max( maxProfit, prices[i] - minNum );
        }
      } 
      return maxProfit;
    }
}