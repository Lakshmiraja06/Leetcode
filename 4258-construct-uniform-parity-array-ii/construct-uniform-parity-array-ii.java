class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        int ecount=0;

        for(int n:nums1){
            min = Math.min(n, min);
            if(n%2==0) ecount++;
        }
        int n1 = nums1.length;
        boolean even = (ecount==n1);
        boolean ismin = (min%2==1);
        return even || ismin;
    }
}