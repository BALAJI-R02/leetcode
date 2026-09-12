// Last updated: 9/12/2026, 2:16:36 PM
1import java.util.*;
2
3class Solution {
4    public int[] maximumWeight(List<List<Integer>> intervals) {
5
6        int n = intervals.size();
7
8        int[][] arr = new int[n][4];
9
10        for (int i = 0; i < n; i++) {
11            arr[i][0] = intervals.get(i).get(0);
12            arr[i][1] = intervals.get(i).get(1);
13            arr[i][2] = intervals.get(i).get(2);
14            arr[i][3] = i;
15        }
16
17        Arrays.sort(arr, (a, b) -> {
18            if (a[1] != b[1])
19                return Integer.compare(a[1], b[1]);
20
21            return Integer.compare(a[0], b[0]);
22        });
23
24        int[] previous = new int[n];
25
26        for (int i = 0; i < n; i++) {
27            int low = 0;
28            int high = i - 1;
29            int pos = -1;
30
31            while (low <= high) {
32                int mid = (low + high) / 2;
33
34                if (arr[mid][1] < arr[i][0]) {
35                    pos = mid;
36                    low = mid + 1;
37                } else {
38                    high = mid - 1;
39                }
40            }
41
42            previous[i] = pos;
43        }
44
45        List<Integer>[][] dp = new ArrayList[5][n + 1];
46
47        for (int k = 0; k <= 4; k++) {
48            for (int i = 0; i <= n; i++) {
49                dp[k][i] = new ArrayList<>();
50            }
51        }
52
53        long[][] value = new long[5][n + 1];
54
55        for (int i = 1; i <= n; i++) {
56
57            int index = i - 1;
58
59            for (int k = 0; k <= 4; k++) {
60
61                // Don't take current interval
62                value[k][i] = value[k][i - 1];
63                dp[k][i] = new ArrayList<>(dp[k][i - 1]);
64
65                // Take current interval
66                if (k > 0) {
67
68                    int p = previous[index] + 1;
69
70                    long take = value[k - 1][p] + arr[index][2];
71
72                    List<Integer> temp =
73                        new ArrayList<>(dp[k - 1][p]);
74
75                    temp.add(arr[index][3]);
76
77                    Collections.sort(temp);
78
79                    if (take > value[k][i] ||
80                        (take == value[k][i] &&
81                         compare(temp, dp[k][i]) < 0)) {
82
83                        value[k][i] = take;
84                        dp[k][i] = temp;
85                    }
86                }
87            }
88        }
89
90        List<Integer> result = dp[4][n];
91
92        // We need the best among at most 4 intervals
93        for (int k = 1; k < 4; k++) {
94
95            if (value[k][n] > value[4][n] ||
96                (value[k][n] == value[4][n] &&
97                 compare(dp[k][n], dp[4][n]) < 0)) {
98
99                result = dp[k][n];
100            }
101        }
102
103        int[] ans = new int[result.size()];
104
105        for (int i = 0; i < result.size(); i++) {
106            ans[i] = result.get(i);
107        }
108
109        return ans;
110    }
111
112    int compare(List<Integer> a, List<Integer> b) {
113
114        int n = Math.min(a.size(), b.size());
115
116        for (int i = 0; i < n; i++) {
117            if (!a.get(i).equals(b.get(i))) {
118                return Integer.compare(a.get(i), b.get(i));
119            }
120        }
121
122        return Integer.compare(a.size(), b.size());
123    }
124}