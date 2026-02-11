// Last updated: 2/11/2026, 2:00:04 PM
class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
           StringBuilder s=new StringBuilder(words[i]);
           s.reverse();
           if(words[i].equals(s.toString())){
            return words[i];
           } 
        }
        String q="";
        return "";
    }
}