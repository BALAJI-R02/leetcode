// Last updated: 8/16/2026, 1:24:22 PM
1class Solution {
2    public String reverseStr(String s, int k) {
3        int size=k*2;
4        char c[]=s.toCharArray();
5        for(int i=0;i<c.length;i+=size){
6            int a=i;
7            int b=Math.min(i+k-1,c.length-1);
8            while(a<b){
9                char temp=c[a];
10                c[a]=c[b];
11                c[b]=temp;
12                a++;
13                b--;
14            }
15        }
16        return new String(c);
17    }
18}