class Solution {
    public int countOdds(int low, int high) {
        int count =0;
        int i = low;
        int j = high;
        while(i<=j){
            if(i%2!=0){
                count +=1;
                i+=2;
            }else{
                i+=1;
            }

        }
        return count;
    }
}