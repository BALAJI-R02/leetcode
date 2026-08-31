// Last updated: 8/31/2026, 8:18:06 PM
1class Solution {
2    public int mySqrt(int x) {
3        if(x==0 || x==1)
4        return x;
5        int s=1;
6        int e=x;
7        int m=-1;
8        while(s<=e){
9            m=s+(e-s)/2;
10            if((long) m*m>(long)x)
11            e=m-1;
12            else if((long) m*m == (long)x)
13            return m;
14            else
15            s=m+1;
16        }
17        return Math.round(e);
18    }
19}