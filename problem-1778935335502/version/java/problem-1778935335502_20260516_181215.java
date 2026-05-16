// Last updated: 5/16/2026, 6:12:15 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> freq = new HashMap<>();
4        for (int n : nums) 
5            freq.put(n, freq.getOrDefault(n, 0) + 1);
6
7        PriorityQueue<Integer> pq =new PriorityQueue<>((a, b) -> Integer.compare(freq.get(a), freq.get(b)));
8        for (int num : freq.keySet()) {
9            pq.add(num);
10            if (pq.size() > k) {
11                pq.poll();
12            }
13        }
14        int[] ans = new int[k];
15        for (int i = k - 1; i >= 0; i--)
16            ans[i] = pq.poll();
17        return ans;
18    }
19}