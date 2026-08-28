// Last updated: 8/28/2026, 9:33:48 AM
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        int b=0,a=0,l=0,o=0,n=0;
4        for(char c:text.toCharArray()){
5            if(c=='b')
6            b++;
7            else if(c=='a')
8            a++;
9            else if(c=='l')
10            l++;
11            else if(c=='o')
12            o++;
13            else if(c=='n')
14            n++;
15        }
16        l=l/2;
17        o=o/2;
18        return Math.min(Math.min(b,a),Math.min(Math.min(l,o),n));
19    }
20}