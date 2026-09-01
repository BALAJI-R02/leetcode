// Last updated: 9/1/2026, 10:04:15 AM
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> l=new ArrayList<>();
4        for(int i=rowIndex;i<=rowIndex;i++){
5            long value=1;
6            for(int j=0;j<=i;j++){
7                l.add((int) value);
8                value=value*(i-j)/(j+1);
9            }
10        }
11        return l;
12    }
13}