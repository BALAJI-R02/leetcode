// Last updated: 8/28/2026, 12:17:30 PM
1class Solution {
2    public int maxProduct(int n) {
3        int m1=0;
4        int m2=0;
5        while(n!=0){
6            int dig=n%10;
7            if(dig>m1){
8                m2=m1;
9                m1=dig;
10            }
11            else if(dig>m2)
12            m2=dig;
13            n=n/10;
14        }
15        return m1*m2;
16    }
17}