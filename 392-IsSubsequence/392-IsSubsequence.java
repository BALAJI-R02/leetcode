// Last updated: 2/11/2026, 2:00:41 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] c = s.toCharArray();
        char[] a = t.toCharArray();

        int pos = 0; 

        for (int i = 0; i < c.length; i++) {
            boolean found = false;

            
            while (pos < a.length) {
                if (a[pos] == c[i]) {
                    found = true;
                    pos++;        
                    break;
                }
                pos++;
            }

            if (!found) return false; 
        }

        return true; 
    }
}
