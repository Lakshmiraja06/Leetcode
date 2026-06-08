class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        long max = nums[0];
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                tmax = smax;
                smax = max;
                max = nums[i];
            }
            else if(smax<nums[i] && nums[i]!=max){
                tmax = smax;
                smax = nums[i];
            }
            else if(tmax<nums[i] && nums[i]!=smax && nums[i]!=max){
                tmax = nums[i];
            }
        }
        return tmax!=Long.MIN_VALUE?(int)tmax:(int)max;
    }
}