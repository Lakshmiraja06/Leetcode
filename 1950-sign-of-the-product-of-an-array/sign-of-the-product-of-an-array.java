class Solution {
    public int arraySign(int[] nums) {
        int val = 1;
        for(int i=0;i<nums.length;i++){
          val *= nums[i];

          if(val ==0) return 0;
          
          val = (val>0)?1:-1;
        }
        return val;
    }
}