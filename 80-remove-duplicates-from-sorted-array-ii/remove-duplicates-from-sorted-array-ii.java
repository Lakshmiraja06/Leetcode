class Solution {
    public int removeDuplicates(int[] nums) {
        int i=2;
        int j=2;
        while(i<nums.length){
            if(nums[j-2]==nums[i]){
                i++;
                continue;
            }else{
                nums[j]=nums[i];
                j++;
                i++;
            }
        }
        return j;
    }
}