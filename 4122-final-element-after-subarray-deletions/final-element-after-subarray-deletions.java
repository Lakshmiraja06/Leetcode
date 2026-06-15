class Solution {
    public int finalElement(int[] nums) {
        int n2 = nums.length-1;
        int n1 = nums[0];
        int res=0;
        res = Math.max(n1, nums[n2]);
            
        return res;
    }
}