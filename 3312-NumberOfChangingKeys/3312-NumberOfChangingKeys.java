// Last updated: 2/11/2026, 1:59:45 PM
class Solution {
    public int countKeyChanges(String s) {
        int co=0;
        String a=s.toLowerCase();
        for(int i=0;i<a.length()-1;i++){
            char c=a.charAt(i);
            char d=a.charAt(i+1);
            if(c!=d)
            co++;
        }
        return co;
    }
}