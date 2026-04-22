class Solution {
    public int countPartitions(int[] nums) {
        int sum =0;
        int sum1=0;
        int count =0;
        int res =0;
        for(int i=0;i<nums.length-1;i++){
            sum+=nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum1+=nums[j];
            }
            res = Math.abs(sum-sum1);
            if(res%2==0){
                count+=1;
            }
            sum1=0;
        }
        
        return count;
    }
}