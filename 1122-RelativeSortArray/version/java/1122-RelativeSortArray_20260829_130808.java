// Last updated: 8/29/2026, 1:08:08 PM
1class Solution {
2    public int[] relativeSortArray(int[] arr1, int[] arr2) {
3
4        int[] arr = new int[arr1.length];
5        int k = 0;
6
7        for (int i = 0; i < arr2.length; i++) {
8            for (int j = 0; j < arr1.length; j++) {
9
10                if (arr1[j] == arr2[i]) {
11                    arr[k] = arr1[j];
12                    k++;
13                    arr1[j] = -1;
14                }
15            }
16        }
17
18        int start = k;
19
20        for (int i = 0; i < arr1.length; i++) {
21            if (arr1[i] != -1) {
22                arr[k] = arr1[i];
23                k++;
24            }
25        }
26
27        Arrays.sort(arr, start, arr.length);
28
29        return arr;
30    }
31}