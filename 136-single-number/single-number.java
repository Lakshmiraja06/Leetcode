class Solution {
    public int singleNumber(int[] nums) {
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     int count =0;
        //     for(int j=0;j<n;j++){
        //         if(nums[i] == nums[j]) count+=1;
        //     }
        //     if(count == 1) return nums[i];
        // }
        // return -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int k : nums){
            map.put(k, map.getOrDefault(k,0)+1);
        }

        for(int k : nums){
            if(map.get(k) == 1){
                return k;
                }
        }
        return -1;
    }
}