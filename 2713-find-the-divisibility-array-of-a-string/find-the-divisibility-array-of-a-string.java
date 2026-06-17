class Solution {
    public int[] divisibilityArray(String word, int m) {
        int n = word.length();
        int[] arr = new int[n];
        long rem = 0;
        for(int i=0;i<n;i++){
            rem  = rem*10+(word.charAt(i) -'0');
            rem %= m;
            if(rem==0) arr[i]=1;
            else arr[i]=0;
        }
        return arr;
    }
}