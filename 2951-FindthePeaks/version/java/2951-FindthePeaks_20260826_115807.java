// Last updated: 8/26/2026, 11:58:07 AM
1class Solution {
2    public List<Integer> findPeaks(int[] mountain) {
3        List <Integer> lst=new ArrayList<>();
4        for(int i=1;i<mountain.length-1;i++){
5            if((mountain[i]> mountain[i-1]) && (mountain[i]>mountain[i+1])){
6                lst.add(i);
7            }
8        }
9        return lst;
10    }
11}