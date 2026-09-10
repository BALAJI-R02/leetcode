// Last updated: 9/10/2026, 10:22:55 AM
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        if (n == 0) 
4            return true;
5        for (int i = 0; i < flowerbed.length; i++) {
6            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
7                flowerbed[i] = 1;
8                n--;
9                if (n == 0) {
10                    return true;
11                }
12            }
13        }
14        return false;
15    }
16}