// Last updated: 8/29/2026, 4:11:03 PM
1class Solution {
2    public int[] separateDigits(int[] nums) {
3        List<Integer> lst=new ArrayList<>();
4        for(int a:nums){
5            String s=Integer.toString(a);
6            for(char ch:s.toCharArray())
7            lst.add(ch-'0');
8        }
9        int arr[]=new int[lst.size()];
10        for(int i=0;i<lst.size();i++){
11            arr[i]=lst.get(i);
12        }
13        return arr;
14    }
15}