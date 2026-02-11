// Last updated: 2/11/2026, 1:59:59 PM
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }
        return n*2;
    }
}