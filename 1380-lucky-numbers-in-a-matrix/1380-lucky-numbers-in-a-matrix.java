class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int[] rowmins=new int[m];
        int[] colmax=new int[n];

        for(int i=0;i<m;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                min=Math.min(min,matrix[i][j]);
            }
            rowmins[i]=min;
        }
        for(int j=0;j<n;j++){
            int max=0;
            for(int i=0;i<m;i++){
                max=Math.max(max,matrix[i][j]);
            }
            colmax[j]=max;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rowmins[i]==matrix[i][j]&&colmax[j]==matrix[i][j]){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}