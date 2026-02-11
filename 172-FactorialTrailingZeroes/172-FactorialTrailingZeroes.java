// Last updated: 2/11/2026, 2:01:10 PM
class Solution {
    public int trailingZeroes(int n) {
        int x=0;
        while(n>0){
            n=n/5;
            x=x+n;
        }
        return x;
    }
}