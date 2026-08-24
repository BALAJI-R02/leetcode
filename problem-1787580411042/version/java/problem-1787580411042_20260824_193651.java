// Last updated: 8/24/2026, 7:36:51 PM
1class Solution {
2    public String capitalizeTitle(String title) {
3        String [] arr=title.split(" ");
4        for(int i=0;i<arr.length;i++){
5            if(arr[i].length()<=2)
6            arr[i]=arr[i].toLowerCase();
7            else
8            arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase();
9        }
10        return String.join(" ",arr);
11
12    }
13}