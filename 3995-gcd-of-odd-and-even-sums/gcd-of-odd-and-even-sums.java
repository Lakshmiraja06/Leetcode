class Solution {
    public int gcdOfOddEvenSums(int n) {
        int esum = 0;
        int osum = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                esum += 2*i;
                osum += (2*i)-1;
            }else{
                esum += 2*i;
                osum += (2*i)-1;
            }
        }
        int res = esum - osum;
        return res;
    }
}
        