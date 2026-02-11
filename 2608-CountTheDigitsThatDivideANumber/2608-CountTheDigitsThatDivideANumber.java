// Last updated: 2/11/2026, 1:59:56 PM
class Solution {
    public int countDigits(int num) {
        int c = num;
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (c % digit == 0) count++;
            num /= 10;
        }
        return count;
    }
}