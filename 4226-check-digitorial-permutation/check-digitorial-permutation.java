class Solution {
    public boolean isDigitorialPermutation(int n) {
        int ori = n;
        int fact=1;
        int sum=0;
        while(n!=0){
            fact=1;
            int dig = n % 10;
            for(int i=dig;i>=1;i--){
                fact *= i;
            }
            n /= 10;
            sum += fact;
        }

        char[] ch= String.valueOf(ori).toCharArray();
        char[] ch1= String.valueOf(sum).toCharArray();
        Arrays.sort(ch);
         Arrays.sort(ch1);
        return Arrays.equals(ch,ch1);
    }
}