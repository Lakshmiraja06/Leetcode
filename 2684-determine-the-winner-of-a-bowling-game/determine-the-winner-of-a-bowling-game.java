class Solution {
    public int isWinner(int[] nums1, int[] nums2) {
        int sum1=nums1[0];
        int sum2=nums2[0];
        for(int i=1;i<nums1.length;i++){
            if(nums1[i-1]==10) sum1+=nums1[i]*2;
            else if(i>=2 && nums1[i-2]==10) sum1+=nums1[i]*2;
            else sum1+=nums1[i];
        }
        for(int i=1;i<nums2.length;i++){
            if(nums2[i-1]==10) sum2+=nums2[i]*2;
            else if( i>=2 && nums2[i-2]==10) sum2+=nums2[i]*2;
            else sum2+=nums2[i];
        }
        if(sum1==sum2) return 0;
        return sum1>sum2?1:2;
    }
}