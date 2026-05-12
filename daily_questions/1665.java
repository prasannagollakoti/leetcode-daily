class Solution {
    public int minimumEffort(int[][] tasks) {
     Arrays.sort(tasks, (a,b) -> b[1] - b[0] - (a[1] - a[0]));
     int s=tasks[0][1];
     int bal= tasks[0][1] - tasks[0][0];
     int loan =0;
     for(int i=1;i< tasks.length; i++){
        int cost=tasks[i][0];
        int tresh=tasks [i][1];
        if( bal <tresh){
            loan +=tresh -bal;
            bal=tresh;
        }
        bal-=cost;
     }   
     return s+loan;
    }
}