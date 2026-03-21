class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int l : nums){
            map.put(l, map.getOrDefault(l,0)+1);
        }

        for(int l : nums){
            if(map.get(l)==1) return l;
        }
        return -1;
    }
}