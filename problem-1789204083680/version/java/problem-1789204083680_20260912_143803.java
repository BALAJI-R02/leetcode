// Last updated: 9/12/2026, 2:38:03 PM
1class Solution {
2    public String defangIPaddr(String address) {
3        String res=address.replace(".","[.]");
4        return res;
5    }
6}