class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count =0;
        for(int i=hours.length-1;i>=0;i--){
            if(target<=hours[i]){
                count+=1;
            }
        }
        return count;
    }
}