// Last updated: 2/11/2026, 2:00:55 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] nonZero = new int[n]; 
        int[] zeros = new int[n];   
        int nonZeroIndex = 0;     
        int zeroIndex = 0;        

       
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nonZero[nonZeroIndex++] = nums[i];
            } else {
                zeros[zeroIndex++] = 0;
            }
        }

       
        int index = 0;

        for (int i = 0; i < nonZeroIndex; i++) {
            nums[index++] = nonZero[i];
        }

       
        for (int i = 0; i < zeroIndex; i++) {
            nums[index++] = zeros[i];
        }
    }
}
