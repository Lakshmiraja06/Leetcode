class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        boolean flag=true;
        while(flag){
            flag=false;
        for(int i=0;i<sb.length();i++){
            for(int j=i+1;j<sb.length();j++){
                
                if(sb.charAt(i)==sb.charAt(j)&& j-i<=k ){
                    sb.deleteCharAt(j);
                    flag=true;
                    break;
                } 
                if(flag)
                break;
            }
        } }
        return sb.toString(); 
    }
}