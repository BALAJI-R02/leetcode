// Last updated: 2/11/2026, 2:00:05 PM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int m=0;
        String[]s=new String[100];
        for(int i=0;i<sentences.length;i++){
            String str=sentences[i];
            s=str.split(" ");
            if(s.length>m)
            m=s.length;
        }
        return m;
    }
}