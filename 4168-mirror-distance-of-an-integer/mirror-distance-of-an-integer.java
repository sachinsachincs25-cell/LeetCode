class Solution {
    public int mirrorDistance(int n) {
        int a=n;
      int rev=0;
      while(n!=0){
        int d=n%10;
        rev=rev*10+d;
        n/=10;}
       if(a>rev){
        return a-rev;

       } else{    
    return rev-a;}
       }
        
    }
