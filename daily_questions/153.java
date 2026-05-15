class Solution {
    public int findMin(int[] nums) {
       int n=nums.length -1;
       int l = nums[n];
       int le=0,ri=n;
       while (le<ri ){
        int m= (le+ri)>>1;
        if(nums[m]>l) le=m+1;
        else ri=m;
       }
       return nums[le];
    }
}