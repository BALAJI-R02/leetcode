// Last updated: 9/1/2026, 12:27:34 PM
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        HashSet<Integer> hs=new HashSet<>();
4        List<Integer> lst=new ArrayList<>();
5        for(int a:nums){
6            if(hs.contains(a)){
7                lst.add(a);
8            }
9            hs.add(a);
10        }
11        return lst;
12    }
13}