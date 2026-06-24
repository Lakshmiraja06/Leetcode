class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int l=0;
        //int r=0;
        int len=0;
        int sum=0;

        for(int r=0;r<n;r++){

            sum+=nums[r];
            len++;

            while(sum>=target){
                min=Math.min(len,min);
                sum-=nums[l];
                len--;
                l++;
            }
        }
        return min!=Integer.MAX_VALUE?min:0;






        // while(r<n){ 
        //     if(sum<target){
        //         sum += nums[r];
        //         len++;
        //         r++;
        //     }
        //      while(sum>=target){
        //         min = Math.min(min, len);
        //         sum -= nums[l];
        //         len--;
        //         l++;  
        //     }
        // }
        // return min!=Integer.MAX_VALUE?min:0;
    }
}