class Solution {
    public int gcdOfOddEvenSums(int n) {
        int esum = 0;
        int osum = 0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0){
                esum += i;
            }else{
                osum += i;
            }
        }
        if(esum % n == 0 && osum % n == 0){
            return n;
        }
        return -1;
        // int esum = 0;
        // int osum = 0;
        // for(int i=1;i<=n;i++){
        //     if(i%2==0){
        //         esum += 2*i;
        //         osum += (2*i)-1;
        //     }else{
        //         esum += 2*i;
        //         osum += (2*i)-1;
        //     }
        // }
        // int res = esum - osum;
        // return res;
    }
}
        