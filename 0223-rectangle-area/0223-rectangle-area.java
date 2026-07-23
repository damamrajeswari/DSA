class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area=(ax2-ax1)*(ay2-ay1)+(bx2-bx1)*(by2-by1);

        int top=Math.min(ay2,by2);
        int bottom=Math.max(by1,ay1);
        int left=Math.max(ax1,bx1);
        int right=Math.min(ax2,bx2);

        if(right>left&&top>bottom){
            int area1=(right-left)*(top-bottom);
            area-=area1;
        }
        return area;
        


    }
}