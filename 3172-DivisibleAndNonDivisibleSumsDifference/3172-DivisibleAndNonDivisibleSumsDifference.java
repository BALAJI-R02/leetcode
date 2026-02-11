// Last updated: 2/11/2026, 1:59:50 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int s=0;
        int s1=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                s=s+i;
            }
            else
            s1=s1+i;
        }
        int q=s1-s;
        return q;
    }
}