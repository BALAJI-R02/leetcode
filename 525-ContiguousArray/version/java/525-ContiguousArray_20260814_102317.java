// Last updated: 8/14/2026, 10:23:17 AM
1class Solution {
2    public int findMaxLength(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        int count = 0;
5        int ans = 0;
6        map.put(0, -1);
7
8        for(int i=0; i<nums.length; i++) {
9            if(nums[i]==1) {
10                count++;
11            }
12            else{
13                count--;
14            }
15
16            if(map.containsKey(count)) {
17                ans = Math.max(ans, i-map.get(count));
18            }
19            else {
20                map.put(count, i);
21            }
22        }
23        return ans;
24    }
25}