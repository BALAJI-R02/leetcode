// Last updated: 8/19/2026, 12:11:07 PM
1class Solution {
2    public List<Integer> selfDividingNumbers(int left, int right) {
3        List<Integer> str=new ArrayList<>();
4        for(int i=left;i<=right;i++){
5            int ele=i;
6            while(ele!=0){
7                int dig=ele%10;
8                if(dig==0 || i%dig!=0)
9                break;
10                ele=ele/10;
11            }
12            if(ele==0)
13            str.add(i);
14        }
15        return str;
16    }
17}