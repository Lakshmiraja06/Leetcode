class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int pro=1;
            for(int j=i;j<nums.length;j++){
                if(pro<k){
                    if(i==j){
                    pro*=nums[i];
                    if(pro<k) count++;
                }else{
                    pro *= nums[j];
                    if(pro<k) count++;
                }
                }else{
                    break;
                }
            }
        }
        return count;
    }
}