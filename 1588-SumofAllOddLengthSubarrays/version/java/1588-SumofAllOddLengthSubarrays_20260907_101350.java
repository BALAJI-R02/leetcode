// Last updated: 9/7/2026, 10:13:50 AM
1class Solution {
2    public int sumOddLengthSubarrays(int[] arr) {
3        int sum = 0;
4        for (int i = 0; i < arr.length; i++) {
5            for (int j = i; j < arr.length; j += 2) {
6                for (int k = i; k <= j; k++) 
7                    sum+=arr[k];
8            }
9        }
10        return sum;
11    }
12}