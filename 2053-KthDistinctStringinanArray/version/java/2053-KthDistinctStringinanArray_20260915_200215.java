// Last updated: 9/15/2026, 8:02:15 PM
1class Solution {
2    public String kthDistinct(String[] arr, int k) {
3        int count = 0;
4        for (int i = 0; i < arr.length; i++) {
5            int frequency = 0;
6            for (int j = 0; j < arr.length; j++) {
7                if (arr[i].equals(arr[j])) 
8                    frequency++;
9            }
10            if (frequency == 1) {
11                count++;
12                if (count == k) {
13                    return arr[i];
14                }
15            }
16        }
17        return "";
18    }
19}