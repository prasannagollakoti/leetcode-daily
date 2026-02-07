class Solution {
    public int minimumDeletions(String s) {
        int b=0,dele=0;
        for(char ch : s.toCharArray()){
            if(ch=='b') b+=1;
            else if(b>0){
                b-=1;
                dele+=1;
            }
        }
        return dele;
    }
}