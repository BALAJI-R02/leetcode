// Last updated: 2/11/2026, 2:00:08 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
    //char[]ch=sentence.toCharArray();
    for(char i='a';i<='z';i++){
        if(!sentence.contains(String.valueOf(i)))
        return false;
        //else
    }
    return true;
    }
}
