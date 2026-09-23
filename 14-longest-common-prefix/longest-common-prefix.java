class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";//Ek empty string banayi jisme common characters store kiya

        for(int i=0;i<strs[0].length();i++){//Yahan hum first string ke characters ko one-by-one check karenge.

            char ch=strs[0].charAt(i);//First string ka current character ch mein store kiya
            for(int j=1;j<strs.length;j++){//Ab second loop baaki strings ko check karega.

                if(i>=strs[j].length() || strs[j].charAt(i)!=ch){//Check karta hai ki current string khatam toh nahi ho gayi or dusri cond Check karta hai ki current character different toh nahi hai.
                    return ans;
                }
            }
            ans+=ch;//Ye tab execute hoga jab sabhi strings mein current character same ho
        }
        return ans;
    }
}