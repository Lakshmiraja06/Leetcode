class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        pq.addAll(map.entrySet());
        
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> m = pq.poll();

            for(int i=0;i<m.getValue();i++){
                sb.append(m.getKey());
            }
        }
        return sb.toString();
    }
}