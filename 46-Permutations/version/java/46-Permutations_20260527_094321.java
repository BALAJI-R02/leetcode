// Last updated: 5/27/2026, 9:43:21 AM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        permuteHelper(nums, 0, res);
5        return res;
6    }
7
8    private void permuteHelper(int[] nums, int i, List<List<Integer>> res) {
9        if (i == nums.length) {
10            List<Integer> permutation = new ArrayList<>();
11            for (int num : nums)
12                permutation.add(num);
13            res.add(permutation);
14            return;
15        }
16
17        for (int j = i; j < nums.length; j++) {
18            swap(nums, i, j);
19            permuteHelper(nums, i + 1, res);
20            swap(nums, i, j);
21        }
22    }
23
24    private void swap(int[] nums, int i, int j) {
25        int tmp = nums[i];
26        nums[i] = nums[j];
27        nums[j] = tmp;
28    }
29}