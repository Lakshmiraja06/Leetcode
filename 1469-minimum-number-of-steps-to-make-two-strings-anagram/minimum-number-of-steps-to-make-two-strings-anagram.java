class Solution {
    public int minSteps(String s, String t) {
        int[] arr= new int[26];
        int count=0;

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);
            arr[ch-'a']++;
        }

        for(int i=0;i<t.length();i++){

            char ch = t.charAt(i);
            arr[ch-'a']--;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) count+=arr[i];
        }
        return count;
    }
}