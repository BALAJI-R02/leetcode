// Last updated: 2/11/2026, 2:01:21 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }

        
        int res[] = new int[m + n];
        
        
        for (int i = 0; i < m; i++) {
            res[i] = arr[i];
        }

       
        for (int i = 0; i < n; i++) {
            res[m + i] = nums2[i];
        }
        Arrays.sort(res);

        for (int i = 0; i < m + n; i++) {
            nums1[i] = res[i];
        }
    }
}
