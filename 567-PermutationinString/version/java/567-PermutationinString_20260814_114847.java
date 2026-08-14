// Last updated: 8/14/2026, 11:48:47 AM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int a=s1.length();
4        int b=s2.length();
5        if(b<a)
6        return false;
7        char arr[]=s1.toCharArray();
8        Arrays.sort(arr);
9        for(int i=0;i<=b-a;i++){
10            String res=s2.substring(i,i+a);
11            char arr1[]=res.toCharArray();
12            Arrays.sort(arr1);
13            if(Arrays.equals(arr,arr1))
14            return true;
15
16        }
17        return false;
18    }
19}