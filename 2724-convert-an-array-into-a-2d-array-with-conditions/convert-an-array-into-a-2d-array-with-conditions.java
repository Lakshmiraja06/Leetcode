class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int n:nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(Integer m : map.values()){
            max=Math.max(m, max);
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
         for(int n:nums){
                l1.add(n);
        }
        for(int i=0;i<max;i++){
            List<Integer> l = new ArrayList<>();
            int in =0;
            while(in<l1.size()){  
                    int num = l1.get(in);

                if(!l.contains(num)){
                    l.add(num);
                    l1.remove(in);  
                }
                else{
                    in++;
                } 
            }
        list.add(l);
    }
    return list;
    }
}