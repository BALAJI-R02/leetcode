// Last updated: 9/17/2026, 9:30:35 AM
1class Solution {
2    public int minSumOfLengths(int[] arr, int target) {
3        int n = arr.length;
4        int[] best = new int[n];
5        int INF = 1000000;
6        for (int i = 0; i < n; i++) 
7            best[i] = INF;
8        int left = 0;
9        int sum = 0;
10        int answer = INF;
11        int minLength = INF;
12        for (int right = 0; right < n; right++) {
13            sum = sum + arr[right];
14            while (sum > target) {
15                sum = sum - arr[left];
16                left++;
17            }
18            if (sum == target) {
19                int length = right - left + 1;
20                if (left > 0 && best[left - 1] != INF) {
21                    answer = Math.min(answer,
22                            length + best[left - 1]);
23                }
24                minLength = Math.min(minLength, length);
25            }
26            best[right] = minLength;
27        }
28        if (answer == INF) 
29            return -1;
30        return answer;
31    }
32}