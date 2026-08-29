// Last updated: 8/29/2026, 3:59:39 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        Arrays.sort(nums);
4        List<Integer> lst=new ArrayList<>();
5        int a=nums[0];
6        for(int i=0;i<nums.length;i++){
7            while(a<nums[i]){
8            lst.add(a);
9            a++;
10            }
11            a++;
12        }
13        return lst;
14    }
15}