// Last updated: 8/29/2026, 1:19:19 PM
1class Solution {
2    public int countConsistentStrings(String allowed, String[] words) {
3        Set<Character> set=new HashSet<>();
4        for(int i=0;i<allowed.length();i++){
5            set.add(allowed.charAt(i));
6        }
7        int count=0;
8        for(String k:words){
9            int flag=1;
10            for(int i=0;i<k.length();i++){
11                if(!set.contains(k.charAt(i))) {
12                    flag=0;
13                    break;
14                }
15            }
16            count+=flag;
17        }
18        return count;
19    }
20}