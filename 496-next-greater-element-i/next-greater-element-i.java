class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int val =-1;
            boolean ok = false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ok = true;
                }
                if(ok){
                    if(nums1[i]<nums2[j]){
                        val = nums2[j];
                        break;
                    }
                }
            }
            arr[i]=val;
        }
        return arr;
    }
}