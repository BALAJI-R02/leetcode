// Last updated: 10/15/2026, 10:13:54 AM
1class Solution {
2    public int countPoints(String rings) {
3        int count = 0;
4        char[] arr = rings.toCharArray();
5        int[] rods = new int[]{1,1,1,1,1,1,1,1,1,1};
6        for(int i = 0; i < arr.length; i += 2){
7            if(arr[i] == 'R')
8                rods[arr[i+1] - '0'] *= 2;
9            else if(arr[i] == 'G')
10                rods[arr[i+1] - '0'] *= 3;
11            else
12                rods[arr[i+1] - '0'] *= 5;
13        }
14        for(int i = 0; i < 10; i++){
15            if(rods[i] % 2 == 0 && rods[i] % 3 == 0 && rods[i] % 5 == 0)
16                count++;
17        }
18        return count;      
19    }
20}