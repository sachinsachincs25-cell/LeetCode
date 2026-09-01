class Solution {
    public boolean checkDivisibility(int n) {
        int dig;
        int sum=0;
        int p=1;
        int a=n;
        while(n>0){
            dig=n%10;
            sum += dig; 
            p=p * dig;
            n = n / 10;
            }
        if(a%(p+sum)==0)
        return true;
        else 
         return false;
    }
}