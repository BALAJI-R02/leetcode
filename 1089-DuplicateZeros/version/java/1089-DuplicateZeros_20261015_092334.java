// Last updated: 10/15/2026, 9:23:34 AM
1class Solution {
2    public void duplicateZeros(int[] arr) {
3        int n = arr.length;
4        int[] result = new int[n];
5        int j = 0;
6        for (int i = 0; i < n && j < n; i++) {
7            if (arr[i] == 0) {
8                result[j] = 0;
9                j++;
10                if (j < n) {
11                    result[j] = 0;
12                    j++;
13                }
14            } else {
15                result[j] = arr[i];
16                j++;
17            }
18        }
19        for (int k = 0; k < n; k++) 
20            arr[k] = result[k];
21    }
22}