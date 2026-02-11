// Last updated: 2/11/2026, 2:00:27 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        int u = 0;

        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                u++;
            }
        }

        
        if (u == word.length()) 
        return true;

       
        if (u == 0) 
        return true;

        
        if (u == 1 && Character.isUpperCase(word.charAt(0)))
         return true;

        return false;
    }
}
