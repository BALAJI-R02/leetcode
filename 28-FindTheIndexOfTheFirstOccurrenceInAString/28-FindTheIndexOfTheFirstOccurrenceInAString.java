// Last updated: 2/11/2026, 2:01:36 PM
class Solution {
    public int strStr(String haystack, String needle) {

        char[] ch = haystack.toCharArray();
        char[] ch1 = needle.toCharArray();

        if (ch1.length == 0) return 0;

        for (int i = 0; i <= ch.length - ch1.length; i++) {

            int j = 0;
            for (j = 0; j < ch1.length; j++) {

                if (ch[i + j] != ch1[j]) {
                    break;
                }
            }

            if (j == ch1.length) {
                return i;
            }
        }

        return -1;
    }
}
