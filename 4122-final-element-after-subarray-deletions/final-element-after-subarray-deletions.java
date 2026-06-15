class Solution {
    public int finalElement(int[] nums) {
        int n = nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            res = Math.max(nums[i], nums[n-1]);
            break;
        }
        return res;
    }
}