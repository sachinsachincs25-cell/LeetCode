class Solution {
    public int addDigits(int num) {
          int sum =0;
          int digit;
          while(num>0){
            digit =  num %10;
            sum+=digit;
            num/=10;}
            while(sum>=10){
                digit=  sum %10;
            int digit1=sum/10;
            sum =digit+digit1;

          }    
        
       return sum;
    }
    }