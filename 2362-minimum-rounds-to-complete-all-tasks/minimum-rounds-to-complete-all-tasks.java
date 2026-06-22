class Solution {
    public int minimumRounds(int[] tasks) {
        int count=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : tasks){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Integer val : map.values()){
            if(val<=1) return -1;
            int res = (val+2)/3;
            count+=res;
        }
        
        return count;
    }
}