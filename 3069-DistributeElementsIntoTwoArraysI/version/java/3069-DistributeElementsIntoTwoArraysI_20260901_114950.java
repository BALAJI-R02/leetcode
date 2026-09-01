// Last updated: 9/1/2026, 11:49:50 AM
1class Solution {
2    public int[] resultArray(int[] nums) {
3
4        int a = nums.length;
5
6        int arr1[] = new int[a];
7        int arr2[] = new int[a];
8        int arr[] = new int[a];
9
10        int o = 0;
11        int p = 0;
12
13        arr1[o] = nums[0];
14        o++;
15
16        arr2[p] = nums[1];
17        p++;
18
19        for (int i = 2; i < a; i++) {
20
21            if (arr1[o - 1] > arr2[p - 1]) {
22                arr1[o] = nums[i];
23                o++;
24            }
25            else {
26                arr2[p] = nums[i];
27                p++;
28            }
29        }
30
31        // Copy arr1
32        int c = 0;
33
34        for (int i = 0; i < o; i++) {
35            arr[c] = arr1[i];
36            c++;
37        }
38
39        // Copy arr2
40        for (int i = 0; i < p; i++) {
41            arr[c] = arr2[i];
42            c++;
43        }
44
45        return arr;
46    }
47}