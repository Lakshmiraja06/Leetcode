class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        long sum =0;
        for(int i=1;i<=k;i++){
            sum += Math.abs(max-min);
        }
        return sum;
    }
}