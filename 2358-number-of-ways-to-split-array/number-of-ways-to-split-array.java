class Solution {
    public int waysToSplitArray(int[] nums) {
        int count=0;
        long sum1=0;
        long sum2=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            sum1 += nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            sum2 += nums[i];

            long res = sum1-sum2;
            if(sum2>=res) count++;
        }
        return count;
    }
}