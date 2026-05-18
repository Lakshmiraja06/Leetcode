class Solution {
    public int alternateDigitSum(int n) {
        int sum =0;
        String s = String.valueOf(n);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int dig = ch - '0';

            if(i%2==0){
                sum += dig;
            }else{
                sum -= dig;
            }
       }
       return sum;
    }
}