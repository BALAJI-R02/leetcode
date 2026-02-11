// Last updated: 2/11/2026, 1:59:38 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int o = 0;

        for (int num : nums) {
            
            if (num % 3 != 0) {
                o++;
            }
        }

        return o;
    }
}
