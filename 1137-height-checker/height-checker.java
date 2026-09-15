class Solution {
    public int heightChecker(int[] heights) {
        int a = heights.length;
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = heights[i];
        }
        Arrays.sort(b);
        int c = 0;
        for (int i = 0; i < a; i++) {
            if (heights[i] != b[i]) {
                c++;
            }
        }
        return c;
    }
}