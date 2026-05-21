class Solution {
    public boolean isBalanced(String num) {
        int n = num.length();
        int esum =0;
        int osum =0;
        for(int i=0;i<n;i++){
            char ch = num.charAt(i);
            int dig = ch - '0';
            if(i%2==0){
                esum += dig;
            }else{
                osum += dig;
            }
        }
        if(esum==osum) return true;
        return false;
    }
}