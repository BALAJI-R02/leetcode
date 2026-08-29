// Last updated: 8/29/2026, 1:13:08 PM
1class Solution {
2    public int minimumSum(int num) {
3        int arr[]=new int[4];
4        int a=0;
5        while(num!=0){
6            int dig=num%10;
7            arr[a++]=dig;
8            num/=10;
9        }
10        Arrays.sort(arr);
11        int num1=arr[0]*10+arr[2];
12        int num2=arr[1]*10+arr[3];
13        return num1+num2;
14    }
15}