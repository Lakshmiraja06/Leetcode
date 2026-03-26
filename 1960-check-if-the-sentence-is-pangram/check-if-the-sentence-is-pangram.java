class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] s = new boolean[26];
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);

            if(ch>='a' && ch<='z'){
                s[ch - 'a'] = true;
            }
        }
        for(int i=0;i<26;i++){
            if(!s[i]) return false;
        }
        return true;
    }
}