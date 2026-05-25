// Last updated: 5/25/2026, 3:58:58 PM
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
4        for(int stone:stones){
5            q.offer(stone);
6        }
7        while(q.size()>1){
8            int y=q.poll();
9            int x=q.poll();
10            if(y!=x)
11            q.offer(y-x);
12        }
13        return q.isEmpty()?0:q.peek();
14    }
15}