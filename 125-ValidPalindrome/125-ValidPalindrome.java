// Last updated: 2/11/2026, 2:01:18 PM
class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(" "))
        return true;
        else{
        s.trim();
        String d = s.replaceAll("[^a-zA-Z0-9]", "");
        String c = d.toLowerCase();
        StringBuilder str=new StringBuilder(c);
        str.reverse();
        if(c.equals(str.toString())){
            return true;
        }else{
            return false;
        }
        }
        // for(int i=0;i<a.length();i++){
        //     char c=a.charAt(i);

        //     if(Character)
        // }
    }
}