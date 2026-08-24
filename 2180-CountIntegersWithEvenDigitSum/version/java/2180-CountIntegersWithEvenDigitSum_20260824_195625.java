// Last updated: 8/24/2026, 7:56:25 PM
1class Solution {
2    public int countEven(int num) {
3        //int s=0;
4        int c=0;
5        for(int i=1;i<=num;i++){
6            int n=i;
7            int s=0;
8            while(n!=0){
9                int dig=n%10;
10                s+=dig;
11                n=n/10;
12            }
13            if(s%2==0)
14            c++;
15            
16        }
17        return c;
18    }
19}