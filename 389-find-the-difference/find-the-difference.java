class Solution {
    public char findTheDifference(String s, String t) {
        int a=0;
        int n=0;
        for(int i=0;i<t.length();i++){
         a=a+t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            n=n+s.charAt(i);
        }
        return (char)(a-n);
    }
}