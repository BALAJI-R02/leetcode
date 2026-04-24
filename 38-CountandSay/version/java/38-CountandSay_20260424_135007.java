// Last updated: 4/24/2026, 1:50:07 PM
1class Solution {
2    public String countAndSay(int n) {
3        String result = "1"; 
4        for (int i = 2; i <= n; i++) {
5            StringBuilder next = new StringBuilder();
6            int count = 1;
7            for (int j = 1; j < result.length(); j++) {
8                if (result.charAt(j) == result.charAt(j - 1)) {
9                    count++;
10                } else {
11                    next.append(count).append(result.charAt(j - 1));
12                    count = 1;
13                }
14            }
15            next.append(count).append(result.charAt(result.length() - 1));
16            result = next.toString();
17        }
18        return result;
19    }
20}