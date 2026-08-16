
    import java.util.*;

    public class isAnagram {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String s = sc.nextLine();
            String t = sc.nextLine();

            if (s.length() != t.length()) {
                System.out.println(false);
                return;
            }

            int[] count = new int[26];

            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
                count[t.charAt(i) - 'a']--;
            }

            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    System.out.println(false);
                    return;
                }
            }

            System.out.println(true);
        }
    }

