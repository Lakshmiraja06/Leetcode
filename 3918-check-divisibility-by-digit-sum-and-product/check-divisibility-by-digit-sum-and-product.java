class Solution {
    public boolean checkDivisibility(int n) {
        //if(n%10==0) return true;
        int sum =0;
        int pro =1;
        int ori =n;
        while(n>0){
            int dig = n%10;
            sum += dig;
            pro *= dig;
            n /= 10;
        }
        int plus = sum+pro;
        if(ori%plus==0) return true;
        return false;
    }
}