class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = Integer.MIN_VALUE;
        int total = 0;
        int i=0;
        int j=n-1;
        while(i<j){
           if(height[i]<=height[j]){
            total = height[i]*(j-i);
            i++;
           }else{
            total = height[j]*(j-i);
            j--;
           }
           max = Math.max(total,max); 
        }
        return max;
    }
}