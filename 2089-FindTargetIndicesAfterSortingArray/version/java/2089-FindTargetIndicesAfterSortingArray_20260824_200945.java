// Last updated: 8/24/2026, 8:09:45 PM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        Arrays.sort(nums);
4        ArrayList<Integer> lst=new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==target){
7                lst.add(i);
8            }
9        }
10        return lst;
11    }
12}