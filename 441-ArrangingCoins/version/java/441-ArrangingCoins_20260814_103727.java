// Last updated: 8/14/2026, 10:37:27 AM
1class Solution {
2    public int arrangeCoins(int n) {
3        int c=0;
4        int i=1;
5        if(n==1)
6        return n;
7        while(n>0){
8        n=n-i;
9        i++;
10        if(n==0){
11            c++;
12        }
13        c++;
14        }
15        return c-1;
16    }
17}