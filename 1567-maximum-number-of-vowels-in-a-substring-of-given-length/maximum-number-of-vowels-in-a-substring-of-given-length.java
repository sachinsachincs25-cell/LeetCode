class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;
        // first window all vowels ke sath hmm
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                s.charAt(i) == 'u') {
                count++;
            }
        }
        max = count;
        // remaining windows yahan aayengi hmmm
        for (int i = k; i < s.length(); i++) {
            // new character hmm
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                s.charAt(i) == 'u') {
                count++;
            }
            // old character remove  hmmm
            if (s.charAt(i - k) == 'a' || s.charAt(i - k) == 'e' ||
                s.charAt(i - k) == 'i' || s.charAt(i - k) == 'o' ||
                s.charAt(i - k) == 'u') {
                count--;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}