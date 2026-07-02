class Solution {
    public long removeZeros(long n) {
        long ans = 0;
        long rem =0;
        while(n!=0){
            long dig = n%10;
            if(dig!=0){
                rem = rem*10+dig;
            }            
            n /= 10;
        }
        while(rem!=0){
            long d = rem%10;
            ans = ans*10+d;
            rem /= 10;
        }
        return ans;
    }
}