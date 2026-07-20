class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3) return 0;
        int count=0;
        int n = nums.length;
        int d=0;
        for(int i=0;i<nums.length-2;i++){
            int diff = nums[i+1]-nums[i];
            for(int j=i+2;j<nums.length;j++){
                d=nums[j]-nums[j-1];
                if(d == diff){
                    count++;
                }else{
                    break;
                }
            }
        }
        
        return count;
    }
}