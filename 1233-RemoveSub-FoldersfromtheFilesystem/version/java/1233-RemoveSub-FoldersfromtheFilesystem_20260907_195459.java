// Last updated: 9/7/2026, 7:54:59 PM
1class Solution {
2    public List<String> removeSubfolders(String[] folder) {
3        Arrays.sort(folder);
4        List<String> ans = new ArrayList<>();
5        ans.add(folder[0]);
6        for (int i = 1; i < folder.length; i++) {
7            String lastFolder = ans.get(ans.size() - 1) + "/";
8            if (!folder[i].startsWith(lastFolder)) {
9                ans.add(folder[i]);
10            }
11        }     
12        return ans;
13    }
14}