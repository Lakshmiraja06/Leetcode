class Solution {
    public int countDigits(int num) {
        int count = 0;
        int ori = num;
        while(num!=0){
            int dig = num % 10;
            if(ori%dig==0) count+=1;
            num /= 10;
        }
        return count;       
    }
}