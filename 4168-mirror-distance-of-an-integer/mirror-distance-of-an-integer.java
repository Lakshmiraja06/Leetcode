class Solution {

    public int reverse(int n){
        int res=0;
        while(n!=0){
            int rev = n % 10;
            res = res*10+rev;
            n /= 10;
        }
        return res;
    }
    public int mirrorDistance(int n) {
        int res = reverse(n);
        int result = Math.abs(n-res);
        return result;
    }
}