class Solution {
    public boolean canReach(int[] start, int[] target) {
        int[][] color=new int[8][8];
        for(int i=0;i<8;i++){
            int j=0;
            if(i%2!=0){
                j=1;
            }
            while(j<8){
                color[i][j]=1;
                j+=2;
            }
        }
        if(color[start[0]][start[1]]==color[target[0]][target[1]]){
            return true;
        }
        return false;

    }
}