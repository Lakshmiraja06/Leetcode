class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] arr = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int sum=0;
            int val = queries[i][0];
            int inx = queries[i][1];

            nums[inx]+=val;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%2==0) sum+=nums[j];
            }
            arr[i]=sum;
        }
        return arr;
    }
}