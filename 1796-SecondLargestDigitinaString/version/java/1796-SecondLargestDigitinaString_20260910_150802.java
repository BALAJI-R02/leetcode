// Last updated: 9/10/2026, 3:08:02 PM
1class Solution {
2    public int secondHighest(String s) {
3        int l=-1;
4        int sl=-1;
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
7                int d=s.charAt(i)-'0';
8                if(d>l)
9                {
10                    sl=l;
11                    l=d;
12                }
13                else if(d>sl && d!=l)
14                sl=d;
15            }
16        }
17        return sl;
18    }
19}