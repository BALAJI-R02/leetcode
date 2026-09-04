// Last updated: 9/4/2026, 8:24:46 PM
1class Solution {
2    public int countOperations(int num1, int num2) {
3        if(num1 == 0 || num2 == 0)
4        return 0;
5        if(num1 == num2)
6        return 1;
7        int res = 0;
8        while(num1 != num2){
9            while(num1>num2){
10                num1-=num2;
11                res++;
12            }
13            while(num2>num1){
14                num2-=num1;
15                res++;
16            }
17        }
18        return res+1;
19    }
20}