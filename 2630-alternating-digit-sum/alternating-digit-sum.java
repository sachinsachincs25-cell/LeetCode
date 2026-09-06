class Solution {
    public int alternateDigitSum(int n) {
        int rev = 0;
        while(n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
      int c=0;
      int sum=0;
      while(rev>0){
        int d=rev%10;
        if(c%2==0){
            sum+=d;
        }else{
            sum+=-d;}
           rev = rev / 10;
            c++;
            }

        return sum;  
    }
}