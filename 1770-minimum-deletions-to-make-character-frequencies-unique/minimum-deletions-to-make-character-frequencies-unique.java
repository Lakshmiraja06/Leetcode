class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        HashSet<Integer> st = new HashSet<>();

        int del=0;
        for(int i=0;i<freq.length;i++){
                while(freq[i]!= 0 && st.contains(freq[i])){
                    freq[i]--;
                    del++;
                 }
                st.add(freq[i]);
        }
        
        return del;
    }
}