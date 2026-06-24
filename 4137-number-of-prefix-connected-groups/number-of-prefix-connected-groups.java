class Solution {
    public int prefixConnected(String[] words, int k) {
        int count =0;

        Map<String, Integer> map = new HashMap<>();

        for(int i=0;i<words.length;i++){
            
            if(words[i].length()>=k){
                String str = words[i].substring(0,k);

                map.put(str, map.getOrDefault(str, 0)+1);

                if(map.get(str)==2) count++;
            }
        }
        return count;
    }
}