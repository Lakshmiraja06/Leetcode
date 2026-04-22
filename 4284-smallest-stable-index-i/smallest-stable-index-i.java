class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = nums[0];
        int res =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
            }
            int min = nums[i];
            for(int j =i;j<nums.length;j++){
                if(min>nums[j]){
                    min = nums[j];
                }
            }
            res = Math.min(res, max-min);
            if(res<=k) return i;
        }
        return -1;           
    }
}