class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long rev=0;
        while(n!=0){
            long dig = n%10;
            if(dig!=0){
                rev = rev*10+dig;
            }
            n /= 10;
        }
        long res=0;
        while(rev!=0){
            long dig = rev%10;
            sum += dig;
            res = res*10+dig;
            rev /= 10;
        }
        return res*sum;
    }
}