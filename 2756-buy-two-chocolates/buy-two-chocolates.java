class Solution {
    public int buyChoco(int[] prices, int money) {
       int min = Integer.MAX_VALUE;
int secondMin = Integer.MAX_VALUE;

for (int i = 0; i < prices.length; i++) {

    if (prices[i] <=min) {
        secondMin = min;
        min = prices[i];
    }
    else if (prices[i] < secondMin && prices[i] != min) {
        secondMin = prices[i];
    }
}
if((secondMin+min)<=money)
{
int n=money-(secondMin+min);
return n;
}
return money;

    }
}