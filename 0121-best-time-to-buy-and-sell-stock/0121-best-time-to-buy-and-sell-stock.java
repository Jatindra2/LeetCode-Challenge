class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0;
        int buy = prices[0];
        for(int i = 1; i<prices.length; i++){
            if(prices[i]>buy){
                maxp = Math.max(maxp, prices[i]-buy);
            }else{
                buy = prices[i];
            }
        }
        return maxp;
    }
}