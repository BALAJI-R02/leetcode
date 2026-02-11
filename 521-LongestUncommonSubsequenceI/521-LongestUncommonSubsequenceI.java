// Last updated: 2/11/2026, 2:00:26 PM
class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b))
        return -1;
        else
        return Math.max(a.length(),b.length());
    }
}