// Last updated: 9/8/2026, 2:55:30 PM
1class Solution {
2    public int integerBreak(int n) {
3        if(n==2)
4        return 1;
5        if(n==3)
6        return 2;
7        int p=1;
8        while(n>4){
9            p*=3;
10            n-=3;
11        }
12        p=p*n;
13        return p;
14    }
15}