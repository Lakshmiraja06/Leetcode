class Solution {
    public int minMaxGame(int[] nums) {
        while(nums.length>1){
        int n = nums.length;
        int[] minmax = new int[n/2];
        for(int i=0;i<n;i+=2){
            if((i/2)%2==0){
                minmax[i/2] = Math.min(nums[i], nums[i+1]);
            }else{
                minmax[i/2] = Math.max(nums[i], nums[i+1]);
            }
        }
        nums = minmax;
    }
        return nums[0];
    }
}