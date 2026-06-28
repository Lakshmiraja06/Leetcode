class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long sum=0;
        int n = nums.length;
        Arrays.sort(nums);
        long max = Long.MIN_VALUE;
        int j=n-1;
        for(int i=0;i<k;i++){
            max = Math.max(nums[j], 1L*nums[j]*mul);
            sum += max;
            j--;
            mul--;
        }
        return sum;
    }
}