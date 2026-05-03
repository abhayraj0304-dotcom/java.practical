class Solution {
    public int addDigits(int n) {
        int digit=0;
        
        int sum=0;
        while (n>=10){
            sum= 0;
        while (n>0){
            digit = n%10;
            sum +=digit;

            n=n/10;
        }
        n=sum;
        }

        return n;
        
    }
}