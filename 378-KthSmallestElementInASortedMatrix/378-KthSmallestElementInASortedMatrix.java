// Last updated: 2/11/2026, 2:00:48 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix.length==1 && matrix[0].length==1)
        return matrix[0][0];
        int []a=new int[matrix.length*matrix[0].length];
        int b=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                a[b++]=matrix[i][j];
            }
        }
        Arrays.sort(a);
        return a[k-1];
    }
}