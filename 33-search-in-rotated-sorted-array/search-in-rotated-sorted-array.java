class Solution {
    public int search(int[] nums, int target) {
        // Array ke har element ko check 
        for(int i=0;i<nums.length;i++){
            // Agar current element target ke equal hai
            if(nums[i]==target){
                // Target ka index return kar do
                return i;
            }
        }
        // Agar target array mein nahi mila
        return -1;
    }
}