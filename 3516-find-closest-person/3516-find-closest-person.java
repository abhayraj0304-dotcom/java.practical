class Solution {
    public int findClosest(int x, int y, int z) {
        int p= Math.abs(z-x);
        int q= Math.abs(z-y);
        if (p<q) return 1;
        else if(q<p) return 2;
        else return 0;
        
    }
}