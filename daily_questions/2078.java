class Solution {
    public int maxDistance(int[] colors) {
        final int n=colors.length;
        final int c0=colors[0],cn=colors[n-1];
        int lmax=0,rmax=0;
        for(int i=0;i<n;i++){
            final int c=colors[i];
            if(c0!=c && i>lmax) lmax=i;
            if(cn!=c && n-1-i>rmax) rmax=n-1-i;
        }
        return Math.max(lmax,rmax);
    }
}