// Last updated: 8/29/2026, 8:16:19 PM
1class Solution {
2    public int convertTime(String current, String correct) {
3        String cur[]=current.split(":");
4        String cor[]=correct.split(":");
5        int cu=Integer.parseInt(cur[0])*60+Integer.parseInt(cur[1]);
6        int cr=Integer.parseInt(cor[0])*60+Integer.parseInt(cor[1]);
7        int c=0;
8        while(cu+60<=cr)
9        {
10            c++;
11            cu+=60;
12        }
13        while(cu+15<=cr)
14        {
15            c++;
16            cu+=15;
17        }
18        while(cu+5<=cr)
19        {
20            c++;
21            cu+=5;
22        }
23        while(cu+1<=cr)
24        {
25            c++;
26            cu+=1;
27        }
28        return c;
29    }
30}