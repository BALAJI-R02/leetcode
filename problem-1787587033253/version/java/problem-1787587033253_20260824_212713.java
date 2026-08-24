// Last updated: 8/24/2026, 9:27:13 PM
1class Solution {
2    public boolean checkIfExist(int[] arr) {
3        for(int i=0;i<arr.length;i++){
4            for(int j=0;j<arr.length;j++){
5                if((i!=j) && (arr[i]==2*arr[j]))
6                return true;
7            }
8        }
9        return false;
10    }
11}