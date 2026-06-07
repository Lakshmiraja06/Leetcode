class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i=0;
        long sum =0;
        int j = nums.length-1;
        while(i<j){
            String s = nums[i]+""+nums[j];
            long res = Long.parseLong(s);
            sum += res;
            i++;
            j--;
        }
        if(i==j){
             sum += nums[i];
        }
        return sum;
    }
}