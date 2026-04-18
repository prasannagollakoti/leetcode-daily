class Solution {
    public int mirrorDistance(int n) {
        int r=0;
        for(int x=n;x>0;x/=10){
            r=10*r+x%10;
        }
        return Math.abs(r-n);
    }
}