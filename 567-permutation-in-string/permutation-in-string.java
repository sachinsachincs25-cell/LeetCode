class Solution{
    public boolean checkInclusion(String s1,String s2){

        //s1 ki length nikal li(agra wale aate hi honge)
        int k=s1.length();
        //s2 me har possible substring ko check karenge
        for(int i=0;i<=s2.length()-k;i++){
            //k length ka substring nikala
            String sub=s2.substring(i,i+k);
            //check kiya ki substring anagram hai ya nahi
            if(isAnagram(s1,sub))
                return true;
        }
        //agar koi bhi anagram nahi mila
        return false;
    }
    public boolean isAnagram(String s,String t){
        //26 letters ki frequency store karne ke liye array
        int[] freq=new int[26];
        //s ke har character ki frequency badha rahe hain
        for(int i=0;i<s.length();i++)
            freq[s.charAt(i)-'a']++;
        //t ke har character ki frequency ghata rahe hain
        for(int i=0;i<t.length();i++)
            freq[t.charAt(i)-'a']--;
        //agar sabki frequency 0 hai to dono anagram hain
        for(int i=0;i<26;i++){
            //koi frequency 0 nahi hai to anagram nahi hai
            if(freq[i]!=0)
                return false;
        }
        //dono strings anagram hain
        return true;
    }
}