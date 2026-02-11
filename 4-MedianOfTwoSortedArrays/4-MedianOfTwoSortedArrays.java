// Last updated: 2/11/2026, 2:01:48 PM


import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x = nums1.length;
        int y = nums2.length;
        int total = x + y;
int m[] = new int[total];
        int n = 0;
        int i;

        for (i = 0; i < x; i++) {
            m[n++] = nums1[i];
        }
        for (i = 0; i < y; i++) {
            m[n++] = nums2[i];
        }
        Arrays.sort(m);

        if (total % 2 == 1) {
            return m[total / 2];
        } else {
            return (m[total / 2 - 1] + m[total / 2]) / 2.0;
        }
    }
}
