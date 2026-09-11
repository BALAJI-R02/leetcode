// Last updated: 9/11/2026, 11:25:11 AM
1class Solution {
2    public String convertDateToBinary(String date) {
3        String year=date.substring(0,4);
4        String mon=date.substring(5,7);
5        String dat=date.substring(8,10);
6        int y=Integer.parseInt(year);
7        int m=Integer.parseInt(mon);
8        int d=Integer.parseInt(dat);
9        String ans="";
10        String by=Integer.toBinaryString(y);
11        ans+=by+"-";
12        String bm=Integer.toBinaryString(m);
13        ans+=bm+"-";
14        String bd=Integer.toBinaryString(d);
15        ans+=bd;
16        return ans;
17    }
18}