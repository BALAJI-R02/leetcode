// Last updated: 7/23/2026, 3:04:37 PM
1class Solution {
2    public int findLucky(int[] arr) {
3        Arrays.sort(arr);
4        int max=0;
5        int count1=0;
6        for(int i=0;i<arr.length;i+=count1){
7            int count=0;
8            for(int j=i;j<arr.length;j++){
9                if(arr[i]==arr[j]){
10                    count++;
11                }
12            }
13            if(count==arr[i]){
14                if(max<count){
15                    max=count;
16                }
17            }
18            count1=count;
19        }
20        if(max==0){
21            return-1;
22        }
23        return max;
24    }
25}