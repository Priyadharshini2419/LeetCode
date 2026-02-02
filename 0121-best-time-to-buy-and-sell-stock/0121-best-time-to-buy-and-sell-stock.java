class Solution {
    public int maxProfit(int[] prices) {
        int miniprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<miniprice){
                miniprice=prices[i];
            }
            else{
                maxprofit=Math.max(maxprofit,prices[i]-miniprice);
            }
        }
        return maxprofit;
    }
}