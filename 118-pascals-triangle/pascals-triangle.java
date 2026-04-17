class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            // for(int j=1;j<=numRows-i-1;j++){
            //     System.out.print(" ");
            // }
            List<Integer> row = new ArrayList<>();
            int num = 1;
            for(int k =0;k<=i;k++){
                row.add(num);
                num = num*(i-k)/(k+1);
            }
            list.add(row);
            //System.out.println();
        }
        return list;
    }
}