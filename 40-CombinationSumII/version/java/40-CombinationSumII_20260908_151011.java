// Last updated: 9/8/2026, 3:10:11 PM
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4        Arrays.sort(candidates);
5        solve(candidates, target, 0, new ArrayList<>(), ans);
6        return ans;
7    }
8    void solve(int[] arr, int target, int start,
9               List<Integer> current,
10               List<List<Integer>> ans) {
11        if (target == 0) {
12            ans.add(new ArrayList<>(current));
13            return;
14        }
15        for (int i = start; i < arr.length; i++) {
16            if (i > start && arr[i] == arr[i - 1]) 
17                continue;
18            if (arr[i] > target) 
19                break;
20            current.add(arr[i]);
21            solve(arr, target - arr[i], i + 1, current, ans);
22            current.remove(current.size() - 1);
23        }
24    }
25}