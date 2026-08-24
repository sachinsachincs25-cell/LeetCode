class Solution {
    public int findGCD(int[] nums) {
        int min = 1000000;
        int max = 0;
        int ans=0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < min)
                min = nums[i];
            if(nums[i] > max)
                max = nums[i];
        }
        for(int i = 1; i <= min; i++) {
        if(min % i == 0 && max % i == 0)
        ans = i;
        }
        
        return ans;
    }
}