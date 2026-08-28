// Last updated: 8/28/2026, 10:15:46 AM
1class Solution {
2    public double[] convertTemperature(double celsius) {
3        double kel=celsius+273.15;
4        double fah=celsius*1.80+32.00;
5        double arr[]=new double[2];
6        for(int i=0;i<1;i++){
7            arr[i]=kel;
8            arr[i+1]=fah;
9        }
10        return arr;
11    }
12}