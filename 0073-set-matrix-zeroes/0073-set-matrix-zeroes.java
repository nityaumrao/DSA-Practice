class Solution {
    public void setZeroes(int[][] matrix) {
        boolean row = false , column = false ;
        
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                    if(i == 0) row = true ;
                    if(j == 0) column = true ;
                }
            }
        }
        
        for(int i = matrix.length-1 ; i>0 ; i--){
            for(int j = matrix[0].length-1 ; j>0 ; j--){
                if(matrix[i][0]==0) matrix[i][j]=0;
                if(matrix[0][j]==0) matrix[i][j]=0;
            }
        }
        if(row) Arrays.fill(matrix[0],0);
        if(column) {
            for(int i = 0 ; i<matrix.length ; i++){
                matrix[i][0]=0 ;
            }
        }
    }
}