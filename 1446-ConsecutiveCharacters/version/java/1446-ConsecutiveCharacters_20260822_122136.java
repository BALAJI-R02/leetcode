// Last updated: 8/22/2026, 12:21:36 PM
1class Solution {
2    public int maxPower(String s) {
3        int count=0;
4        int max=0;
5        int count1=0;
6        char c[]=s.toCharArray();
7        for(int i=0;i<c.length;i++){
8            count=0;
9            for(int j=i;j<c.length;j++){
10                if(c[i]==c[j])
11                count++;
12                else
13                break;
14            }
15            if(max<count)
16            max=count;
17            //count1=count;
18        }
19        return max;
20    }
21}