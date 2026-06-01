class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int t=0;
        for (int i=cost.length -1;i>=0;i-=3){
            t+=cost[i];
            if (i-1>=0) t+=cost[i-1];
        }
        return t;
    }
}