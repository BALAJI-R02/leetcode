// Last updated: 8/22/2026, 3:21:27 PM
1class Solution {
2    public String thousandSeparator(int n) {
3        String sb=Integer.toString(n);
4        if(sb.length()<4)
5        return sb;
6        String str="";
7        int c=-1;
8        for(int i=sb.length()-1;i>=0;i--){
9            c++;
10            if(c%3==0){
11                str+=".";
12                str+=sb.charAt(i);
13            }
14            else
15            str+=sb.charAt(i);
16        }
17        String q=str.substring(1,str.length());
18        StringBuilder w=new StringBuilder(q);
19        return w.reverse().toString();
20    }
21}
22