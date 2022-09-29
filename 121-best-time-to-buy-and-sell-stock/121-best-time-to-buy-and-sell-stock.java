class Solution {
    public int maxProfit(int[] prices) {
//         int ans = 0;
//         for(int i=0;i<prices.length-1;i++){
//             for(int j=i+1;j<prices.length;j++){
               
//                 if(prices[j]-prices[i]>0 && prices[j]-prices[i]>ans){
//                     ans = prices[j]-prices[i];
//                 }
//             }
//         }
//         return ans;
        int len = prices.length;
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < len; i++) {
            int profit = prices[i]-minPrice;        
            maxProfit = Math.max(maxProfit,profit);                 
            minPrice = Math.min(minPrice,prices[i]); 
        }
        return maxProfit;        
    }
}