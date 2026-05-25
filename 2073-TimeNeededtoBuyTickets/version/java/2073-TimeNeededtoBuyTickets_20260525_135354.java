// Last updated: 5/25/2026, 1:53:54 PM
1import java.util.*;
2class Solution{
3    public int timeRequiredToBuy(int[]tickets,int k){
4        Queue<int[]>q=new LinkedList<>();
5        for(int i=0;i<tickets.length;i++)
6        q.offer(new int[]{i,tickets[i]});
7        int time=0;
8        while(!q.isEmpty()){
9            int[]person=q.poll();
10            int index=person[0];
11            int rem=person[1];
12            rem--;
13            time++;
14            if(rem==0){
15                if(index==k){
16                    return time;
17                }
18            }
19            else
20            q.offer(new int[]{index,rem});
21        }
22        return time;
23    }
24}
25