// Last updated: 8/25/2026, 8:04:02 PM
1class Solution {
2    public List<String> stringMatching(String[] words) {
3        List<String> lst=new ArrayList<>();
4        for(int i=0;i<words.length;i++){
5            for(int j=0;j<words.length;j++){
6                if((i!=j) && words[j].contains(words[i])){
7                    lst.add(words[i]);
8                    break;
9                }
10            }
11        }
12        return lst;
13    }
14}