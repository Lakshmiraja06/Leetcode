class Solution {
    public int maximumPossibleSize(int[] nums) {
        int count=1;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(prev<=nums[i]){
                prev=nums[i];
                count++;
            }
        }
        return count;
    }
}