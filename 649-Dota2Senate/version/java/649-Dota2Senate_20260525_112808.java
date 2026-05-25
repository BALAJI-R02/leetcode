// Last updated: 5/25/2026, 11:28:08 AM
1class Solution {
2    public String predictPartyVictory(String senate) {
3        Queue<Integer>radiant=new LinkedList<>();
4        Queue<Integer>dire=new LinkedList<>();
5        int n=senate.length();
6        for(int i=0;i<n;i++){
7            if(senate.charAt(i)=='R')
8            radiant.offer(i);
9            else
10            dire.offer(i);
11        }
12        while(!radiant.isEmpty() && !dire.isEmpty()){
13            int r=radiant.poll();
14            int d=dire.poll();
15            if(r<d){
16                radiant.offer(r+n);
17            }
18            else
19            dire.offer(d+n);
20        }
21        return radiant.isEmpty()?"Dire":"Radiant";
22    }
23}