class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder Ans=new StringBuilder();
        int i=0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
            Ans.append(word1.charAt(i));
            }
         if(i<word2.length()){
            Ans.append(word2.charAt(i));

         
         }
        i++;}
    
    return Ans.toString();
}}