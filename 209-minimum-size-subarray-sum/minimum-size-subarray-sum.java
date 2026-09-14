class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int sum=0;//for window
      int min=Integer.MAX_VALUE;//min ke liye max value
      int Start=0;
      int End=0;
     for(;End<nums.length;End++){//window ko expand karna hai sum ke karke
         sum+=nums[End];
         while(sum>=target){
            int size=End-Start+1;//min size
            min=Math.min(min,size);
            sum-=nums[Start++];//yahan shirnk kar rha hun 
         }
     }
      if (min != Integer.MAX_VALUE) {
            return min;
        } else {
            return 0;
        }
    }
}