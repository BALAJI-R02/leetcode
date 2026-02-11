// Last updated: 2/11/2026, 2:00:42 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int xor = 0;

        for (char c : s.toCharArray()) {
            xor ^= c;
        }

       
        for (char c : t.toCharArray()) {
            xor ^= c;
        }

       
        return (char) xor;
    }
}
