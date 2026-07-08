class Solution {
    public int carFleet(int target, int[] pos, int[] sp) {
        int count=0;
        double max =Integer.MIN_VALUE;
        
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<pos.length;i++){
            map.put(pos[i], sp[i]);
        }
        Arrays.sort(pos);
        for(int i=pos.length-1;i>=0;i--){
            double n = target-pos[i];
            double a = map.get(pos[i]);
            double time = n / a;
            if(time>max){
                count++;
                max=time;
            }   
        }
        return count;
    }
}