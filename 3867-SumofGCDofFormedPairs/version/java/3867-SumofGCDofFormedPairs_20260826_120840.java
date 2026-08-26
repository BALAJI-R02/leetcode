// Last updated: 8/26/2026, 12:08:40 PM
1class Solution {
2    public long gcdSum(int[] nums) {
3        int [] pgcd=new int[nums.length];
4        int max=-1;
5        for(int i=0;i<nums.length;i++){
6            max=Math.max(max,nums[i]);
7            pgcd[i]=gcd(max,nums[i]);
8        }
9        Arrays.sort(pgcd);
10        long sum=0;
11        int i=0;
12        int j=nums.length-1;
13        while(i<j){
14            sum+=gcd(pgcd[i],pgcd[j]);
15            i++;
16            j--;
17        }
18        return sum;
19    }
20    private int gcd(int a,int b){
21        while(b!=0){
22            int temp=b;
23            b=a%b;
24            a=temp;
25        }
26        return a;
27    }
28}