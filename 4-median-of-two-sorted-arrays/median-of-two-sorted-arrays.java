class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int n1 = nums2.length;
        int[] arr = new int[n+n1];
        for(int i=0;i<n;i++){
            arr[i] = nums1[i];
        }
        for(int j=0;j<n1;j++){
            arr[n + j] = nums2[j];
        }
        Arrays.sort(arr);
        int nn = arr.length;
        int k = nn/2;
        if(nn%2==0){
             return (double) (arr[k] + arr[k-1]) / 2;
        }else{
            return (double) arr[k];
        }
    }
}