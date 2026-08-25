// Last updated: 8/25/2026, 8:15:55 PM
1class Solution {
2    public int sumOfUnique(int[] nums) {
3        int s=0;
4        int op[]=new int[256];
5        for(int a:nums){
6            op[a]++;
7        }
8        for(int i=0;i<op.length;i++){
9            if(op[i]==1)
10            s+=i;
11        }
12        return s;
13    }
14}