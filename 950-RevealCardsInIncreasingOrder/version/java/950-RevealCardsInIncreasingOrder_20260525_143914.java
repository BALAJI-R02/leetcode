// Last updated: 5/25/2026, 2:39:14 PM
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        int n=deck.length;
4        Arrays.sort(deck);
5        Queue<Integer>q=new LinkedList<>();
6        for(int i=0;i<n;i++)
7        q.offer(i);
8        int[]ans=new int[n];
9        for(int card:deck){
10            int index=q.poll();
11            ans[index]=card;
12            if(!q.isEmpty())
13            q.offer(q.poll());
14        }
15        return ans;
16    }
17}