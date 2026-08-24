// Last updated: 8/24/2026, 12:05:46 PM
1class Solution {
2    public int finalValueAfterOperations(String[] operations) {
3        int X=0;
4        String c="";
5        int q=0;
6        for(int i=0;i<operations.length;i++){
7            c=operations[i];
8            if(c.equals("++X"))
9            ++X;
10            else if(c.equals("X++"))
11            X++;
12            else if(c.equals("X--"))
13            X--;
14            else
15            --X;
16        }
17        return X;
18    }
19}