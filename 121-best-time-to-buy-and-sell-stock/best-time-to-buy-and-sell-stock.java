class Solution {
    public int maxProfit(int[] prices) {
    int maxprofit=0;
    int min=prices[0];
    for(int i=0;i<prices.length;i++)
    {
        if(prices[i]-min>maxprofit)
        maxprofit=prices[i]-min;
        else if(prices[i]<min)
        min=prices[i];
    }
    return maxprofit;
    }
}