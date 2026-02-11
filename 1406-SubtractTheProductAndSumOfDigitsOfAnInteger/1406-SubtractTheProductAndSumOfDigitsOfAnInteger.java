// Last updated: 2/11/2026, 2:00:16 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int s=0;
        while(n!=0){
            int d=n%10;
            p=p*d;
            s=s+d;
            n=n/10;
        }
        int r=p-s;
        return r;
    }
}