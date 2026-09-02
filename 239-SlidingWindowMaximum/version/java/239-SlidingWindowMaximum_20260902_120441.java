// Last updated: 9/2/2026, 12:04:41 PM
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        int n = nums.length;
4        int[] arr = new int[n - k + 1];
5        Deque<Integer> dq = new ArrayDeque<>();
6        for (int i = 0; i < n; i++) {
7            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
8                dq.pollFirst();
9            }
10            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
11                dq.pollLast();
12            }
13            dq.addLast(i);
14            if (i >= k - 1) {
15                arr[i - k + 1] = nums[dq.peekFirst()];
16            }
17        }
18        return arr;
19    }
20}