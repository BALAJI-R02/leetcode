// Last updated: 2/11/2026, 2:01:02 PM
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area = 0;
        int r1 = (ax2 - ax1) * (ay2 - ay1);
        int r2 = (bx2 - bx1) * (by2 - by1);
        area = r1 + r2;

        int l = Math.min(bx2, ax2) - Math.max(bx1, ax1);
        int h = Math.min(by2, ay2) - Math.max(by1, ay1);
        int a = l * h;

        if(l <=0 || h <= 0){
            a = 0;
        }
        area = area - a;
        return area;
    }
}