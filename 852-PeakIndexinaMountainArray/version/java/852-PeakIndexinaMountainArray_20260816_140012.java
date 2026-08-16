// Last updated: 8/16/2026, 2:00:12 PM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int s=0;
4        int e=arr.length-1;
5        //int m=s+e/2;
6        while(s<e){
7            int m=s+(e-s)/2;
8            if(arr[m]>arr[m+1])
9            e=m;
10            else
11            s=m+1;
12        }
13        return s;
14    }
15}