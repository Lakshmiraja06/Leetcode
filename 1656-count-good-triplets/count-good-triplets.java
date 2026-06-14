class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    int s1= Math.abs(arr[i]-arr[j]);
                    int s2 = Math.abs(arr[j]-arr[k]);
                    int s3 = Math.abs(arr[i]-arr[k]);
                    if((s1<=a) && (s2<=b) && (s3<=c)) count+=1;
                }
            }
        } 
        return count;
    }
}