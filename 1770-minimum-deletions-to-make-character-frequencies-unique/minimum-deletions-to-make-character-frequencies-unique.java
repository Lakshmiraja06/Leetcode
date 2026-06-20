class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        HashSet<Integer> st = new HashSet<>();

        int del=0;
        for(int value:freq){
                while(value!= 0 && st.contains(value)){
                    value--;
                    // st.add(temp);
                    del++;
                 }
                st.add(value);
        }
        
        return del;
    }
}