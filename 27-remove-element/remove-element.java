class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        // array ke har element ko check karenge
        for(int i = 0; i < n; i++) {
            // agar current element val ke equal hai
            if(nums[i] == val) {
                // current element ko remove karne ke liye
                // uske baad ke saare elements ek position left shift karenge
                for(int j = i; j < n - 1; j++) {
                    // next element ko current position par daal rahe hain
                    nums[j] = nums[j + 1];
                }
                // ek element remove ho gaya
                // isliye array ki valid length 1 kam kar di
                n--;
                // shift hone ke baad naye element ko bhi check karna hai
                // isliye i ko ek step peeche kar diya
                i--;
            }
        }
        // final valid elements ki length return kar rahe hain
        return n;
    }
}