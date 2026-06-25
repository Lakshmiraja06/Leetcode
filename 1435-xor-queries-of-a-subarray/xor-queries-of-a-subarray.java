class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] arr1 = new int[queries.length];
        for(int i=0;i<queries.length;i++){

            int st = queries[i][0];
            int end = queries[i][1];
            int a = arr[st];
            for(int j=st+1;j<=end;j++){
                a = a^arr[j];
            }
            arr1[i]=a;
        }
        return arr1;
    }
}