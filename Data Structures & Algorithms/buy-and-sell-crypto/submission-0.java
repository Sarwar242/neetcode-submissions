class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;

        int k=0;
        int max=0;
        int min=Integer.MAX_VALUE;
        while(k<prices.length){
            min=Math.min(min,prices[k]);
            max=Math.max(max,prices[k]-min);
            k++;
        }
        return max;
    }
}
