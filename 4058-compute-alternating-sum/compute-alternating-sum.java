class Solution {
    public int alternatingSum(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int i = 0; i < nums.length; i++) {
            if(i%2==0){
            sum=sum+nums[i];}
            else if(i%2!=0){
                sum1=sum1 +nums[i]*-1;
                
            }
           
           
            
         }
        
          return sum+sum1;
    }
}       