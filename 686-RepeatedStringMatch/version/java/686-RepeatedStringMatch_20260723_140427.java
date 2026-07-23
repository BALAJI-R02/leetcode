// Last updated: 7/23/2026, 2:04:27 PM
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3        StringBuilder str = new StringBuilder();
4        int c=0;
5        while(str.length()<b.length()){
6            str.append(a);
7            c++;
8            if(str.toString().contains(b))
9            return c;
10        }
11        str.append(a);
12        c++;
13        if(str.toString().contains(b)){
14        return c;
15        }
16        return -1;
17    }
18}