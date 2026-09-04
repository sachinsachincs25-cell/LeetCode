class Solution {
    public int countOdds(int low, int high) {
        int c = 0;
        if (low % 2 == 0) {
            low++;
        }
        while (low <= high) {
            c++;
            low += 2;
        }
        return c;
    }
}