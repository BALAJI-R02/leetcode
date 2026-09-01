// Last updated: 9/1/2026, 11:18:45 AM
1class Solution {
2    public int[][] flipAndInvertImage(int[][] image) {
3        int arr[][]=new int[image.length][image[0].length];
4        int b=0;
5        for(int i=0;i<image.length;i++){
6            b=0;
7            for(int j=image[0].length-1;j>=0;j--){
8                arr[i][b]=image[i][j];
9                b++;
10            }
11        }
12        for(int i=0;i<arr.length;i++){
13            for(int j=0;j<arr[0].length;j++){
14                if(arr[i][j]==0)
15                arr[i][j]=1;
16                else
17                arr[i][j]=0;
18            }
19        }
20        return arr;
21    }
22}