class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            int dig = 0;
            int sum =0;
            while(n>0){
                dig = n % 10;
                sum += dig * dig;
                n /= 10;
            }
            n = sum;
        }
        if(n==1) return true;
        return false;
    }
}