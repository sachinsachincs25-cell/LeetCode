class Solution {
    public int missingMultiple(int[] nums, int k) {
        for (int a = k; ; a += k) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == a) {
                    count++;
                }
            }
            if (count == 0) {
                return a;
            }
        }
  
    }
}