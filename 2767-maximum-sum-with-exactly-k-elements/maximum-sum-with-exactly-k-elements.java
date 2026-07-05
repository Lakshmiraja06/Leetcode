class Solution {
    public int maximizeSum(int[] nums, int k) {
        // int max=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     max =Math.max(nums[i],max);
        // }
        int n = nums.length;
        Arrays.sort(nums);
        int sum=0;
        int max=nums[n-1];
        for(int i=0;i<k;i++){
            sum += max+i;
        }
        return sum;
    }
}