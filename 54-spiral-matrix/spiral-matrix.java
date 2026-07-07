class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top=0;
        int bo=matrix.length-1;
        int left=0;
        int ri=matrix[0].length-1;
        while(top<=bo && left<=ri){
            for(int i=left;i<=ri;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bo;i++){
                list.add(matrix[i][ri]);
            }
            ri--;
            if(top<=bo){
                for(int i=ri;i>=left;i--){
                    list.add(matrix[bo][i]);
                }
                bo--;
            }
            if(left<=ri){
                for(int i=bo;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}