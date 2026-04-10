class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        int temp = n;
        while(temp % 3 == 0){
            temp /= 3;
            n = temp;
        }
        return temp == 1;
    }
}