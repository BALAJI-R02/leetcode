// Last updated: 9/11/2026, 11:21:26 AM
1class Solution {
2    public int countSeniors(String[] details) {
3        int c=0;
4        for(int i=0;i<details.length;i++){
5            String res=details[i];
6            String op=res.substring(11,13);
7            int age=Integer.parseInt(op);
8            if(age>60)
9            c++;
10        }
11        return c;
12    }
13}