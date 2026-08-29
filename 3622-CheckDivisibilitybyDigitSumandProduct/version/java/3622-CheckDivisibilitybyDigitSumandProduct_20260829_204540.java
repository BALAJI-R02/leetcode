// Last updated: 8/29/2026, 8:45:40 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int s=0;
4        int q=n;
5        int pro=1;
6        int ans=0;
7        while(n!=0){
8            int dig=n%10;
9            s+=dig;
10            pro*=dig;
11            n=n/10;
12        }
13        return q%(s+pro)==n;
14    }
15}