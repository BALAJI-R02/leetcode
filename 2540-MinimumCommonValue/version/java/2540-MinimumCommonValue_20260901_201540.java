// Last updated: 9/1/2026, 8:15:40 PM
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3        HashSet<Integer> hs=new HashSet<>();
4        for(int a:nums1){
5            hs.add(a);
6        }
7        for(int a:nums2){
8            if(hs.contains(a))
9            return a;
10        }
11        return -1;
12    }
13}