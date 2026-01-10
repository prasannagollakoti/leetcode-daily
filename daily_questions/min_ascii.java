class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        char [] a =s1.toCharArray();
        int n= a.length;
        int cost1=0;
        for(char c :a) cost1 +=c;
        char [] b =s2.toCharArray();
        int m=b.length;
        int cost2=0;
        for (char c:b) cost2+=c;
        int [][] dp =new int[n+1][m+1];
        for(int i =n-1;i>=0;i--){
            for (int j=m-1;j>=0;j--){
                if(a[i]==b[j]){
                    dp[i][j]=a[i]+dp[i+1][j+1];

                }
                else{
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return cost1+cost2-2 * dp[0][0];
    }
}