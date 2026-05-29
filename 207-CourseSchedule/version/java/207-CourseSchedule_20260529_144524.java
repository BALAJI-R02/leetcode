// Last updated: 5/29/2026, 2:45:24 PM
1class Solution {
2    public boolean canFinish(int courses, int[][] prerequisites) {
3       List<List<Integer>> adj=new ArrayList<>();
4       for(int i=0;i<courses;i++)
5       adj.add(new ArrayList<>());
6       int []indegree=new int[courses];
7       for(int[]pre:prerequisites){
8        int course=pre[0];
9        int prerequisite=pre[1];
10        adj.get(prerequisite).add(course);
11        indegree[course]++;
12       } 
13       Queue<Integer>q=new LinkedList<>();
14       for(int i=0;i<courses;i++){
15        if(indegree[i]==0){
16            q.offer(i);
17        }
18       }
19       int completed=0;
20       while(!q.isEmpty()){
21        int temp=q.poll();
22        completed++;
23        for(int neigh:adj.get(temp)){
24            indegree[neigh]--;
25            if(indegree[neigh]==0)
26            q.offer(neigh);
27        }
28       }
29       return completed==courses;
30    }
31}
32