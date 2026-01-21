class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int a[]= new int[nums.size()];
        for(int i=0 ; i<nums.size(); i++){
            int n = nums.get(i);
            if(n!=2) a[i]=n-((n+1)&(-n-1))/2;
            else a[i]=-1;
        }
        return a;
    }
}