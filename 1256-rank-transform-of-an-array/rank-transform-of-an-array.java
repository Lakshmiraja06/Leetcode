class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] nums = new int[arr.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];  
        }
        Arrays.sort(nums);
        int[] ans = new int[arr.length];
        int rank =1;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], rank);
                rank++;
            }
        }
        for(int i=0;i<nums.length;i++){
            ans[i]= map.get(arr[i]);
        }
        return ans;
    }
}