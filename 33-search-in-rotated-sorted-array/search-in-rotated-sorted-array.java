class Solution {
    public int search(int[] nums, int target) {
        int find = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                if(find == -1) find = i;
                return find;
            }
        }
        return find;
    }
}