class Solution {
    public int trap(int[] height) {
       int r = 0;
       int l = height.length-1;
       int lmax = 0;
       int rmax = 0;
       int res = 0;
       while(r<l){
        if(height[r]<height[l]){
            if(rmax<=height[r]){
                rmax = height[r];
            }else{
                res += rmax - height[r];
        }
        r++;
        }else{
             if(lmax<=height[l]){
                lmax = height[l];
            }else{
                res += lmax - height[l];
        }
        l--;
        }
        
       }
       return res;
    }
}