class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=arr1.length;
        for(int i=0;i<arr1.length;i++){
            boolean ok = false;
            for(int j=0;j<arr2.length;j++){
                int res = Math.abs(arr1[i]-arr2[j]);

                if(res <= d){
                    ok=true;
                    //break;
                }
            }
            if(ok) count--;
        }
        return count;
    }
}