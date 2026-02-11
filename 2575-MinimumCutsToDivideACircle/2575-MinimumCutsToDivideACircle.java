// Last updated: 2/11/2026, 1:59:58 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1)
        return 0;
        if(n%2==0)
        return n/2;
        else
        return n;
    }
}