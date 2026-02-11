// Last updated: 2/11/2026, 2:00:07 PM
class Solution {
    public int countTriples(int n) {
        int x=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int c=i*i+j*j;
                int d=(int)Math.sqrt(c);
                if(d*d==c && d<=n)
                x++;
            }    
        }
        return x;
    }
}