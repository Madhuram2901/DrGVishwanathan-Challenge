class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int diff = 0;

        for(int i = 1; i < prices.length; i++){
            diff = Math.max(diff, prices[i] - minPrice);

            minPrice = Math.min(minPrice, prices[i]);
        }
        return diff;
    }
}