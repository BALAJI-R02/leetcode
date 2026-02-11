// Last updated: 2/11/2026, 2:00:58 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int n : nums) {
            if (set.contains(n)) {
                set.remove(n);
            } else {
                set.add(n);
            }
        }

       
        int[] result = new int[set.size()];
        int i = 0;
        for (int n : set) {
            result[i++] = n;
        }

        return result;
    }
}
