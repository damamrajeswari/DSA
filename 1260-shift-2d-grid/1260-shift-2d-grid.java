class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int total=m*n;
        k=k%total;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                list.add(grid[i][j]);
            }
        }
         List<List<Integer>> ans = new ArrayList<>();

        // Build shifted grid
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int index = (i * n + j - k + total) % total;
                row.add(list.get(index));
            }
            ans.add(row);
        }

        return ans;

    }
}