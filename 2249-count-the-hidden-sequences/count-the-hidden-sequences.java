class Solution {
    public int numberOfArrays(int[] d, int lower, int upper) {
        int max = 0;
        int min = 0;
        int sum=0;
        for(int i=0;i<d.length;i++){
            sum += d[i];
            max = Math.max(sum, max);
            min = Math.min(sum, min);
            if(max-min>upper-lower) return 0;
        }
        return (upper-lower)-(max-min)+1;
    }
}