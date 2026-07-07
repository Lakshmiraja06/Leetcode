class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        if(n==1) arr[0][0]=1;
        int num =1;
        int top=0;
        int bo=n-1;
        int left=0;
        int ri=n-1;
        while(top<=bo && left<=ri){
            for(int i=left;i<=ri;i++){
                arr[top][i]=num;
                num++;
            }
            top++;
            for(int i=top;i<=bo;i++){
                arr[i][ri] = num;
                num++;
            }
            ri--;
            if(top<=bo){
                for(int i=ri;i>=left;i--){
                    arr[bo][i] = num;
                    num++;
                }
                bo--;
            }
            if(left<=ri){
                for(int i=bo;i>=top;i--){
                    arr[i][left]=num;
                    num++;
                }
                left++;
            }
        }
        return arr;
    }
}