class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            int dcount =0;
            int temp = nums[i];
            while(temp!=0){
                int last = temp%10;
                dcount+=1;
                temp /= 10;
            }
            if(dcount%2==0) count+=1;
        }
        return count;
    }
}