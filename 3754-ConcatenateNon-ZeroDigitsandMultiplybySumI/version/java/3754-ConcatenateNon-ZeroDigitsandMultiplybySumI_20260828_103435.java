// Last updated: 8/28/2026, 10:34:35 AM
1class Solution {
2    public long sumAndMultiply(int n) {
3        int x=0;
4        int s=0;
5        String res=Integer.toString(n);
6        for(int i=0;i<res.length();i++){
7            int dig=res.charAt(i)-'0';
8            if(dig!=0)
9            x=x*10+dig;
10            s+=dig;
11        }
12        return (long) x*s;
13    }
14}