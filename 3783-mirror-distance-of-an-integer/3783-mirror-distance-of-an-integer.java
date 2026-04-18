class Solution {
    public int mirrorDistance(int n) {
        int digit=0;
        int rev=0;
        int org=n;

        while (n!=0){
            digit= n%10;
            rev= rev*10+digit;
            n=n/10;
        }
        return Math.abs(org-rev);
        
    }
}