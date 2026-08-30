// Last updated: 8/30/2026, 11:10:28 AM
1class Solution {
2    public int countGoodTriplets(int[] arr, int a, int b, int c) {
3        int count=0;
4        int len=arr.length;
5        for(int i=0;i<len;i++){
6            for(int j=i+1;j<len;j++){
7                if(Math.abs(arr[i]-arr[j])<=a){
8                for(int k=j+1;k<len;k++){
9                    if(Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c)
10                    count++;
11                    
12                }
13                }
14            }
15        }
16        return count;
17    }
18}