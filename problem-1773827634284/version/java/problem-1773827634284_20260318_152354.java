// Last updated: 3/18/2026, 3:23:54 PM
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isComposite = new boolean[n];

        for (int p = 2; (long)p * p < n; p++) {
            if (!isComposite[p]) {
                for (long m = (long)p * p; m < n; m += p) {
                    isComposite[(int)m] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) count++;
        }
        return count;
    }
}