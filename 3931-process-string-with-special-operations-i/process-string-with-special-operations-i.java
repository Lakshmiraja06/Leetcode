class Solution {
    public String processStr(String s) {
        String s1 = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            //char res = ch;
            if(Character.isLetter(ch)){
                s1 += ch;
            }
            else if(ch=='#'){
                // if(s1.length()>0){
                //     s1 += s1.charAt(s1.length()-1);
                // }
                s1 += s1;
            }
            else if(ch=='%'){

                String s2="";

                for(int j=s1.length()-1;j>=0;j--){
                    s2 += s1.charAt(j);
                }
                s1=s2;
            }else{
                if(s1.length()>0){
                    s1 = s1.substring(0, s1.length() - 1);
                }
            }
        }
        return s1;
    }
}