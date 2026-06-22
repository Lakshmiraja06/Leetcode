class Solution {
    public long getDescentPeriods(int[] prices) {
        int n = prices.length;
        long count=n;
        long len =1;
        for(int i=1;i<n;i++){
            if(prices[i-1]-prices[i]==1){
                count += len;
                len++;
            }else{
                len =1;
            }
        }
        return count;
    }
}