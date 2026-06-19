class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count =1;
        int st =0;
        for(int end =1;end<nums.length;end++){
            if(nums[end]-nums[st]>k){
                count++;
                st = end;
            }
        }
        return count;
    }
}