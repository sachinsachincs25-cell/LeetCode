class Solution {
    public int smallestNumber(int n, int t) {
       for (int i = n; ; i++){
            int product = 1;
            int a = i;

        while(a> 0){
           int  d=a % 10;
            product = product * d;
            a= a/ 10;
        }
        if (product % t==0){
        return i;
        }
     } 
   }
}
