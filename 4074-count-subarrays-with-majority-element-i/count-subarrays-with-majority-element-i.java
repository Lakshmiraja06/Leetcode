class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            int len=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target) c++;
                len++;

                if(c>len/2) count++;
            }
        }
        return count;
    }
}