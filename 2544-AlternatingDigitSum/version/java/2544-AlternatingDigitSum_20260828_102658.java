// Last updated: 8/28/2026, 10:26:58 AM
1class Solution {
2    public int alternateDigitSum(int n) {
3        String res=Integer.toString(n);
4        int s=0;
5        for(int i=0;i<res.length();i++){
6            int  dig=res.charAt(i)-'0';
7            if(i%2==0)
8            s+=dig;
9            else
10            s-=dig;
11        }
12        return s;
13    }
14}