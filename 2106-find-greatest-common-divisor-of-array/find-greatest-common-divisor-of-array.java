class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n : nums){
            min = Math.min(n, min);
            max = Math.max(n, max);
        }
        int res=1;
        //if(max%min==0) return min;
        for(int i=2;i<=max;i++){
            if(min%i == 0 && max%i == 0){
                res=i;
            }
        }
        return res;
    }
}