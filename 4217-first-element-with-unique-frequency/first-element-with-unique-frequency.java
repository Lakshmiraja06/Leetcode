class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer>  map1 = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        for(int n:map.values()){
            map1.put(n, map1.getOrDefault(n, 0)+1);  
        }
        for(int n : nums){
        int freq = map.get(n);

        if(map1.get(freq) == 1){
            return n;
        }
    }

    return -1;
    }
}