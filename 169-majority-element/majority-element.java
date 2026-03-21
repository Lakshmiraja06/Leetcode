class Solution {
    public int majorityElement(int[] nums) {
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     int count = 0;
        //     for(int j=0;j<n;j++){
        //         if(nums[i] == nums[j]) count++;
        //     }
        // if(count>n/2) return nums[i];
        // }
        // return -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
            
            if(map.get(n)> nums.length/2){
                return n;
        }
        }
        return -1;
    }
}