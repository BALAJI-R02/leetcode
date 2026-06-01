// Last updated: 6/1/2026, 11:35:28 AM
1class Solution{ 
2    public int climbStairs(int n) {
3        if(n<=2)return n;
4        int arr[]=new int[n+1];
5        arr[1]=1;
6        arr[2]=2;
7        for(int i=3;i<=n;i++)
8        arr[i]=arr[i-1]+arr[i-2];
9        return arr[n];
10    }
11}