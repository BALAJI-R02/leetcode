// Last updated: 9/4/2026, 8:20:50 PM
1class Solution {
2    public int reachNumber(int target) {
3        int sum =0;
4        int steps = 0;
5        if(target ==0) 
6        return 0;
7        target = Math.abs(target);
8        while(sum< target){
9            sum+=steps;
10            steps++;
11        }
12        
13        while(((sum-target)%2!=0)){
14            sum+=steps;
15            steps++;
16        }
17        return steps-1;
18
19    }
20}