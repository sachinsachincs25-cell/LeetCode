import java.util.*;
public class checkInclusion {

        public static boolean checkInclusion(String s1,String s2){

            //s1 ki length nikali
            int k=s1.length();

            //s2 me har possible substring check karenge
            for(int i=0;i<=s2.length()-k;i++){

                //k length ka substring nikala
                String sub=s2.substring(i,i+k);

                //check kiya anagram hai ya nahi
                if(isAnagram(s1,sub))
                    return true;
            }

            //koi anagram nahi mila
            return false;
        }

        public static boolean isAnagram(String s,String t){

            //26 letters ki frequency ke liye array
            int[] freq=new int[26];

            //s ke characters ki frequency badhai
            for(int i=0;i<s.length();i++)
                freq[s.charAt(i)-'a']++;

            //t ke characters ki frequency ghatai
            for(int i=0;i<t.length();i++)
                freq[t.charAt(i)-'a']--;

            //check ki sab frequency 0 hai ya nahi
            for(int i=0;i<26;i++){

                //agar koi frequency 0 nahi hai
                if(freq[i]!=0)
                    return false;
            }

            //dono anagram hain
            return true;
        }

        public static void main(String[]args){

            //input lene ke liye Scanner
            Scanner sc=new Scanner(System.in);

            //s1 input
            String s1=sc.next();

            //s2 input
            String s2=sc.next();

            //answer print kiya
            System.out.println(checkInclusion(s1,s2));
        }
    }

