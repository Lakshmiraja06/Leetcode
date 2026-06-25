class Solution {
    public boolean closeStrings(String word1, String word2) {

        if(word1.length()!=word2.length()) return false;

        boolean res=false;

        int[] arr1=new int[26];
        int[] arr2=new int[26];

        for(int i=0;i<word1.length();i++){

            char ch = word1.charAt(i);

            if(word2.contains(String.valueOf(ch))) res=true;
            else return false;
            
        }

        //HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0;i<word1.length();i++){

            char ch = word1.charAt(i);

            arr1[ch - 'a']++;
            
        }

        for(int i=0;i<word2.length();i++){

            char ch = word2.charAt(i);

            arr2[ch - 'a']++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if((arr1[i]!=0 && arr2[i]!=0)){
                if(arr1[i]==arr2[i]) res=true;
                else {
                    res = false;
                    break;
            }
            }
        }

        return res;
    }
}