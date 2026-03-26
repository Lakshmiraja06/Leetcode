class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count =0;
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                count += 1;
            }else{
                max = Math.max(max,count);
                count =0;
            }
        }
        max = Math.max(count,max);
        if(max>=3) return true;
        return false;
    }
}