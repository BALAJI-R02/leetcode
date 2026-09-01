// Last updated: 9/1/2026, 9:54:43 AM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> list=new ArrayList<>();
4        for(int i=0;i<numRows;i++){
5            List<Integer> l=new ArrayList<>();
6            int value=1;
7        for(int j=0;j<=i;j++){
8            
9            l.add(value);
10            value=value*(i-j)/(j+1);
11        }
12        list.add(l);
13        }
14        return list;
15    }
16}