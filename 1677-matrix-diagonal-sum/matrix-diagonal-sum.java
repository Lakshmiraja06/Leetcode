class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==j) sum += mat[i][j];
            }
        }

        int i=0;
        int j =n-1;
        while(j>=0){
            if(i!=j) sum += mat[i][j];
            i++;
            j--;
        }
        return sum;
    }
}