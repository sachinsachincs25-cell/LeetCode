class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // Har character ka count store karne ke liye array banaya hmm check karen
        int[] arr = new int[256];
        // Window ka left pointer 0 se start hoga okay geeeeeee
        int left = 0;  
        // Abhi tak longest substring ki length 0 hai hmm done hai
        int max = 0;
        // Right pointer ko 0 se string ke end tak chalayenge
        for (int right = 0; right < s.length(); right++) {
            // Current character ka count 1 se increase kar diya
            arr[s.charAt(right)]++;
            // Agar current character repeat ho gaya hai
            while (arr[s.charAt(right)] > 1) {
                // Left wale character ka count decrease karenge
                arr[s.charAt(left)]--;
                // Left pointer ko ek step right move karenge
                left++;
            }
            // Current window ki length nikal kar max se compare karenge
            if (right - left + 1 > max) {       
                // Agar current window badi hai to max update kar denge
                max = right - left + 1;
            }
        }
        // Sabse longest substring ki length return karenge
        return max;
    }
}