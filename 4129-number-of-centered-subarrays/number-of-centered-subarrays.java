class Solution {
    public int centeredSubarrays(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int n:nums){
            list.add(n);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];

                if(list.subList(i, j+1).contains(sum)) count++;
            }
        }
        return count;
    }
}