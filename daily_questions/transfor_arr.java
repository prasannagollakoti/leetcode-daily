class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] r= new int [n];
        for(int i=0;i<n;i++){
            int target=((i+nums[i])%n+n)%n;
            r[i]=nums[target];
        }
        return r;
    }
}