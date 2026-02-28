class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int sum =0;
        int digitsum =0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int temp = nums[i];
            while(temp>0){
                digitsum+=temp % 10;
                temp /= 10;
            }
        }
        int result = sum - digitsum;
        return result;
    }
}