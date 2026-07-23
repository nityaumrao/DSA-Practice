class Solution {
    public int orangesRotting(int[][] grid) {
        return f1(2,grid,false) ;
    }
    private int f1(int time , int[][] grid , boolean flag){
        
        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0 ; i<n ; i++){
            for(int  j = 0 ; j<m ; j++){
                if(grid[i][j]==time ){
                    if(i!=0 && grid[i-1][j]==1) grid[i-1][j]=time+1;
                    if(j!=0 && grid[i][j-1]==1) grid[i][j-1]=time+1;
                    if(i!=n-1 && grid[i+1][j]==1) grid[i+1][j]=time+1;
                    if(j!=m-1 && grid[i][j+1]==1) grid[i][j+1]=time+1;
                    flag = true ;
                }
            }
        }
        if(flag) return f1(time+1 , grid, false);
        time = 0 ;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                if(grid[i][j]==1) return -1 ;
                time=Math.max(time,grid[i][j]);
            }
        }
        return Math.max(0,time-2) ;
    }
}