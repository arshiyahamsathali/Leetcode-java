class Solution {
    public int maxProfit(int[] prices) {
        //start with the biggest number
        int minPrice = Integer.MAX_VALUE;
        //start with zero profit
        int maxProfit = 0;

        for(int price : prices){
            if(price < minPrice){
                 // found a new cheaper day to buy
                minPrice = price;
            }else{
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}