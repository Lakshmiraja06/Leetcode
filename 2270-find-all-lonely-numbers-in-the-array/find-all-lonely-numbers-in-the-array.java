class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
         if(nums.length==1){
            list.add(nums[0]);
            return list;
        }
        int n = nums.length-1;
        for(int i=0;i<nums.length;i++){
            
            if(i==0){
                if(nums[i]==nums[i+1] || nums[i]+1==nums[i+1]) continue;
                else list.add(nums[i]);
            }
            if(i==n){
                if(nums[i]==nums[i-1] || nums[i]-1==nums[i-1]) continue;
                else list.add(nums[i]);
            }
            else if(i>0 && i<n){
                if(nums[i]==nums[i-1] || nums[i]==nums[i+1] || nums[i]-1==nums[i-1] || nums[i]+1==nums[i+1]) continue;
                else list.add(nums[i]);
            }
        
            
        }
        return list;
    }
}