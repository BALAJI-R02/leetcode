// Last updated: 2/11/2026, 2:00:14 PM
class Solution {
    public int xorOperation(int n, int start) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=start+2*i;
        }
        int x=0;
        for(int i=0;i<n;i++)
        x=x^arr[i];
        return x;
    }
}