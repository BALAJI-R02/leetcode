// Last updated: 8/29/2026, 1:44:39 PM
1class Solution {
2    public boolean halvesAreAlike(String s) {
3        String vow = "aeiouAEIOU";
4        int c = 0;
5        int c2 = 0;
6        for (int i = 0; i < s.length() / 2; i++) {
7            if (vow.indexOf(s.charAt(i)) != -1) 
8                c++;
9        }
10        for (int i = s.length() / 2; i < s.length(); i++) {
11            if (vow.indexOf(s.charAt(i)) != -1) 
12                c2++;
13        }
14        if(c==c2)
15        return true;
16        return false;
17    }
18}