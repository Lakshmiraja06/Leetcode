class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();
         HashSet<Character> set1 = new HashSet<>();

        int count =0;

        for(char ch : word.toCharArray())
        {
            set.add(ch);
        }

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);

            if(Character.isLowerCase(ch)){
                if(set.contains(Character.toUpperCase(ch)) && !set1.contains(ch)){
                     count+=1;

                     set1.add(ch);
                }
            }

        }
        return count;
    }
}