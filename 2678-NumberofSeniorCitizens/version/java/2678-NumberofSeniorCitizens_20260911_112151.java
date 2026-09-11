// Last updated: 9/11/2026, 11:21:51 AM
class Solution {
    public int countSeniors(String[] d) {
        int count=0;
        int n1=0,n2=0;
        for(int i=0;i<d.length;i++){
            n1=d[i].charAt(11)-'0';
            n2=d[i].charAt(12)-'0';
        if((n1>=6 && n2>0) || (n1>6 && n2>=0)){
            count++;
        }
        }
        return count;
        
    }
}