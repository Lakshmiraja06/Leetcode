class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int[] arr = new int[divisors.length];
        for(int i=0;i<divisors.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%divisors[i]==0){
                    count++;
                }
            }
            arr[i]=count;
        }
        int max = Integer.MIN_VALUE;
        int ans =Integer.MAX_VALUE;;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                ans = divisors[i];
            }else if(max==arr[i]){
                ans = Math.min(ans, divisors[i]);
            }
        }
        return ans;
    }
}