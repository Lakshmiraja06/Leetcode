class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int length = 0;
        for(int[] row : matrix){
            length += row.length;
        }

        int[] arr = new int[length];
        int ind =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                arr[ind++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==k-1) return arr[i];
        }
        return 0;
    }
}