class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] maxi = new int[n];
        int[] mini = new int[n];
        int max = nums[0];
        maxi[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(nums[i], max);
            maxi[i] = max;
        }
        int min = nums[n-1];
        mini[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            min = Math.min(nums[i], min);
            mini[i] = min;
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            res = Math.min(maxi[i]-mini[i], res);
            if(res<=k) return i;
        }
        return -1;
    }
}