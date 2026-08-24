// Last updated: 8/24/2026, 9:13:36 PM
1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        //int a=arr.length;
4        for(int n:arr){
5            if(n<=k)
6            k++;
7            else
8            break;
9        }
10        return k;
11    }
12}